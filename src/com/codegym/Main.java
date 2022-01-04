package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ax + B = C");
        float a;
        float b;
        float c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("A = ");
        a = scanner.nextFloat();
        System.out.println("B = ");
        b = scanner.nextFloat();
        System.out.println("C =");
        c = scanner.nextFloat();
        float x;
        if (a !=0){
            x = (c-b)/a;
            System.out.println("Nghiệm của phương trình là X = "+ x);
        } else if (b ==c){
            System.out.println("Phương trình có vô số nghiệm");
        } else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
