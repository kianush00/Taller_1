package com.company;

public class Main {

    public static void main(String[] args) {
        int carrito[][] = new int[definirNumeroAleatorioEntre(1,20)][16];    //de 0 a 15 productos cada  celda

    }

    public static int definirNumeroAleatorioEntre(int min, int max){
        return (int) (Math.random() * ((max + 1) - min)) + min;
    }

    public static void llenarArreglo(int[][] carrito){
        for (int i=0; i<carrito.length; i++){
            carrito[i][0] = 500 + i*150;
        }
    }

    public static void mostrarCarrito(int[][] carrito){
        for (int i=0; i<carrito.length; i++){
            for (int j=0; j<carrito[0].length; j++){
                System.out.print(carrito[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirCantidadProductos(){

    }
}
