package com.company;

public class Main {


    public static void main(String[] args) {
        funcaoSoma(2, 2);
        funcaoSubtair(2,5);
    }
    public static void funcaoSubtair(double x, double y){
        double z = x + y;
    }
    public static void funcaoSoma(int x, int y){
        int z = x+y;
        System.out.println("A soma de " + x + " mais " + y + " é igual a: " + z);
    }
}
