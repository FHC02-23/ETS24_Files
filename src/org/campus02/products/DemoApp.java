package org.campus02.products;

public class DemoApp {
    public static void main(String[] args) {

        Product p1 = new Product("Table Börn", 129.99, "Furniture");
        Product p2 = new Product("Nike Air Jordan 1", 299.99, "Sneaker");
        Product p3 = new Product("Tesla M3", 43000, "Electric Car");

        ProductManager pm = new ProductManager();
        /*pm.add(p1);
        pm.add(p2);
        pm.add(p3);
        System.out.println("pm = " + pm);

        try {
            pm.save("D:\\Temp\\ETS24\\products.prod");
        } catch (ProductSaveException e) {
            e.printStackTrace();
        }*/


        try {
            pm.load("D:\\Temp\\ETS24\\products.rod");
        } catch (ProductLoadException e) {
            throw new RuntimeException(e);
        }
        System.out.println(pm);
    }
}
