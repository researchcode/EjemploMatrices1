package ejerciciomatrices;

import java.util.Scanner;

public class EjercicioMatrices {

    Scanner sc = new Scanner(System.in);
    int[][] matrizNumeros = new int[2][3];

    public static void main(String[] args) {
        EjercicioMatrices obj = new EjercicioMatrices();
        obj.llenarMatriz();
        obj.imprimirMatriz();
        obj.sumarParesMatriz();
    }//Cierra main

    public void llenarMatriz() {
        for (int i = 0; i < matrizNumeros.length; i++) {//filas
            for (int j = 0; j < matrizNumeros[i].length; j++) {//columnas
                System.out.println("Ingrese número de la posición " + i + "-" + j);
                matrizNumeros[i][j] = Integer.parseInt(sc.nextLine());
            }//cierra for filas
        }//cierra for columnas
    }//cierra llenarMatriz

    public void imprimirMatriz() {
        System.out.println("**************************");
        for (int i = 0; i < matrizNumeros.length; i++) {//filas
            for (int j = 0; j < matrizNumeros[i].length; j++) {//columnas
                System.out.print(matrizNumeros[i][j] + "\t");
            }//cierra for filas
            System.out.println("");
        }//cierra for columnas
    }//cierra imprimirMatriz

    public void sumarParesMatriz() {
        int suma = 0;
        for (int i = 0; i < matrizNumeros.length; i++) {//filas
            for (int j = 0; j < matrizNumeros[i].length; j++) {//columnas
                if (matrizNumeros[i][j] % 2 == 0) {
                    suma += matrizNumeros[i][j];
                }
            }
        }
        System.out.println("La suma de los pares es: " + suma);
    }//cierra sumarParesMatriz

}//Cierra class
