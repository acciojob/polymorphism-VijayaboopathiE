package com.driver;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter int x,y,z");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println("Enter double a,b");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        int w=p.product(x,y);
        System.out.println(w);
        System.out.println(p.product(x,y,z));
        System.out.println(p.product(a,b));

    }
}
