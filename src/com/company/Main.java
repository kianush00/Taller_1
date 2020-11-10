package com.company;

public class Main {

    public static void main(String[] args) {
        int carrito[][] = new int[definirNumeroAleatorioEntre(1,20)][16];    //de 0 a 15 productos cada  celda
        llenarPrecios(carrito);
        llenarCarrito(carrito);
        imprimirCantidadProductos(carrito);
        mostrarCarrito(carrito);
    }

    public static int definirNumeroAleatorioEntre(int min, int max){
        return (int) (Math.random() * ((max + 1) - min)) + min;
    }

    public static void llenarPrecios(int[][] carrito){
        for (int i=0; i<carrito.length; i++){
            carrito[i][0] = 500 + i*150;
        }
    }

    public static void llenarCarrito(int[][] carrito){
        for (int i=0; i<carrito.length; i++){
            agregarProductos(carrito, i, definirNumeroAleatorioEntre(0,15));
        }
    }

    public static void agregarProductos(int[][] carrito, int posicionPrecio, int cantidad){
        for (int j=1; j<(cantidad + 1); j++){
            carrito[posicionPrecio][j] = carrito[posicionPrecio][0];
        }
    }

    public static void imprimirCantidadProductos(int[][] carrito){
        System.out.println("El carrito contiene " + calcularCantidadProductos(carrito) + " productos.");
    }

    public static int calcularCantidadProductos(int[][] carrito){
        int acumulador = 0;

        for (int i=0; i<carrito.length; i++){
            for (int j=1; j<carrito[0].length; j++){
                if(carrito[i][j] > 0){
                    acumulador++;
                }
            }
        }

        return acumulador;
    }

    public static void mostrarCarrito(int[][] carrito){
        for (int i=0; i<carrito.length; i++){
            for (int j=0; j<carrito[0].length; j++){
                System.out.print(carrito[i][j] + " ");
            }
            System.out.println();
        }
    }
}
