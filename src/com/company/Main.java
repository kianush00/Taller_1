package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(definirNumeroAleatorioEntre(1,3));
        System.out.println(definirNumeroAleatorioEntre(1,3));
        System.out.println(definirNumeroAleatorioEntre(1,3));
        System.out.println(definirNumeroAleatorioEntre(1,3));
    }

    public static int definirNumeroAleatorioEntre(int min, int max){
        return (int) (Math.random() * (max - min)) + min;
    }

    public static void imprimirCantidadProductos(){

    }
}
