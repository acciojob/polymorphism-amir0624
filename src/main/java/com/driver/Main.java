package com.driver;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.product(5,10));

    }
    static class Product{
        public int product(int x, int y) {
            return  x + y;
        }
        public int product(int x, int y, int z) {
            return x + y + z;
        }
        public double product(double x, double y) {
            return  x + y;
        }
    }
}