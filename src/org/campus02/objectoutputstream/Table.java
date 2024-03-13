package org.campus02.objectoutputstream;

import java.io.Serializable;

public class Table implements Serializable {
    private int length;
    private int height;
    private int weight;
    private String name;


    public Table(String name, int length, int height, int weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tables{" +
                "length=" + length +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
