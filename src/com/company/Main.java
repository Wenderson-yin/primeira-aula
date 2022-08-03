package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        funcaoSoma(2, 2);
//        funcaoSubtair(2,5);
//        List<String> x = nomesDeAlunos("wenderson", "lucas", "paulo");
//        for (String s: x){
//            System.out.println(s);
//        }
//        System.out.println(x.get(1));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é seu nome?");
        String s = scanner.nextLine();
        System.out.println("Que ano você nasceu?");
        int ano = Integer.parseInt(scanner.nextLine());
        int idade = 2022-ano;
        System.out.println("Nome:" + s );
        System.out.println("Idade: " + idade);

    }
    public static List<String> nomesDeAlunos(String s, String str, String a){
        List<String> listString = new ArrayList<>();
            listString.add(s);
            listString.add(str);
            listString.add(a);
            return listString;
        }
    public static void funcaoSubtair(double x, double y){
        double z = x + y;
    }
    public static void funcaoSoma(int x, int y){
        int z = x+y;
        System.out.println("A soma de " + x + " mais " + y + " é igual a: " + z);
    }
}
