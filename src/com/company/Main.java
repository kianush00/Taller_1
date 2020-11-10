package com.company;

public class Main {

    public static void main(String[] args) {
        int carrito[][] = new int[definirNumeroAleatorioEntre(1,20)][16];    //de 0 a 15 productos cada  celda
        llenarPrecios(carrito);
        llenarCarrito(carrito);
        imprimirCantidadProductos(carrito);
        imprimirCarrito(carrito);
    }

    public static void imprimirDetallesCarrito(int[][] carrito){
        for (int i=0; i<carrito.length; i++){
            imprimirDetallesCeldaCarrito(carrito,i);
        }
    }

    public static void imprimirDetallesCeldaCarrito(int[][] carrito, int posicion){
        System.out.println("Cantidad producto [" + posicion + "]: " +
                calcularSubCantidadProductos(carrito,posicion) + ", Subtotal: $" +
                calcularSubTotal(carrito,posicion));
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

    private static void agregarProductos(int[][] carrito, int posicionPrecio, int cantidad){
        for (int j=1; j<(cantidad + 1); j++){
            carrito[posicionPrecio][j] = carrito[posicionPrecio][0];
        }
    }

    public static void imprimirCantidadProductos(int[][] carrito){
        System.out.println("El carrito contiene " + calcularCantidadProductos(carrito) + " productos.");
    }

    public static int calcularCompraTotal(int[][] carrito){
        int acumulador = 0;

        for (int i=0; i<carrito.length; i++){
            acumulador = calcularSubTotal(carrito,i);
        }

        return acumulador;
    }

    public static int calcularSubTotal(int[][] carrito, int posicion){
        int acumulador = 0;

        for (int j=1; j<carrito[0].length; j++){
            acumulador += carrito[posicion][j];
        }

        return acumulador;
    }

    private static int definirNumeroAleatorioEntre(int min, int max){
        return (int) (Math.random() * ((max + 1) - min)) + min;
    }

    private static int calcularCantidadProductos(int[][] carrito){
        int acumulador = 0;

        for (int i=0; i<carrito.length; i++){
            acumulador = calcularSubCantidadProductos(carrito, i);
        }

        return acumulador;
    }

    private static int calcularSubCantidadProductos(int[][] carrito, int posicion){
        int acumulador = 0;

        for (int j=1; j<carrito[0].length; j++){
            if(carrito[posicion][j] > 0){
                acumulador++;
            }
        }

        return acumulador;
    }

    private static void imprimirCarrito(int[][] carrito){
        for (int i=0; i<carrito.length; i++){
            for (int j=0; j<carrito[0].length; j++){
                System.out.print(carrito[i][j] + " ");
            }
            System.out.println();
        }
    }
}
