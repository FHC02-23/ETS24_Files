package org.campus02.products;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product p) {
        products.add(p);
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "products=" + products +
                '}';
    }

    public void save(String path) throws ProductSaveException {

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(path))){

            for(Product p : products){
                oos.writeObject(p);
            }
            oos.writeObject(null);
            oos.flush();

        } catch (FileNotFoundException e) {
            throw new ProductSaveException(path, e);
        } catch (IOException e) {
            throw new ProductSaveException(path, e);
        }
    }

    public void load(String path) throws ProductLoadException {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(path))){

            Object obj;
            while ((obj = ois.readObject()) != null) {
                add((Product) obj);
            }

        } catch (FileNotFoundException e) {
            throw new ProductLoadException(path, e);
        } catch (IOException e) {
            throw new ProductLoadException(path, e);
        } catch (ClassNotFoundException e) {
            throw new ProductLoadException(path, e);
        }
    }
}
