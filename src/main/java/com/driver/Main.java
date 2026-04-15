package com.driver;
public class Main {
    public static class Product {
        public int product(int x, int y) {

            return x*y;
        }

        public int product(int x, int y, int z) {

            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String[] args) {
        Product p = new Product();
        int x=10;
        int y=20;
        int z=30;
        double a=17.5;
        double b=23.5;
        int w=p.product(x,y);
        System.out.println(w);
        System.out.println(p.product(x,y,z));
        System.out.println(p.product(a,b));

    }
}
