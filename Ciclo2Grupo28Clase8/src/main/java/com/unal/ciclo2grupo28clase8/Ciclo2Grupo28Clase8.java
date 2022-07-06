package com.unal.ciclo2grupo28clase8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase8 {

    public static void main(String[] args) {
        //   T[] x=new T[n];

        int vAnterior[] = {1, 5, 8, -7};//Hard coded= codigo quemado
        int v[] = new int[5];
        String s[] = new String[3];
        //Alumno salon[] = new Alumno[3];

        v[0] = 45;
        v[1] = 35;
        v[2] = 25;
        v[3] = 15;
        v[4] = 5;
        //v[5]=45;//error
        
        /*
        s[0] = "Misael";
        s[0] = "Fernando";

        Alumno fer = new Alumno();
        fer.nombre = "Fernando";
        fer.edad = 35;
        */
        
        //salon[0] = new Alumno("Misael", 35);
        //salon[0] = new Alumno("Laura", 40);

        /*
        int arregloA[] = lee_arreglo_enteros();
        escribe_arreglo_reales(arregloA);
        System.out.println("La suma de los N elementos "
                + "del arreglo es: " + suma_arreglo_reales(arregloA));

        System.out.println("La suma de los N elementos "
                + "del arreglo es: " + suma_arreglo_ints_iteracion(arregloA));

        System.out.println("Valor mayor en la posicion [" + pos_maximo(arregloA) + "]");

        //  T[]= new T[n][m]
        char c[][] = new char[10][20];//matriz de 10x20 caracteres
        int[][] A = new int[5][4];//matriz de 5x4 enteros
        double[][] y = new double[6][6];//matriz de 6x6 reales
        boolean[][] b = new boolean[2][3];//matriz de 2x3 booleanos
        */

        int[][] datos = {
            {1, 5, 8, -7},
            {2, -8, 0,6},
            {3, -1, 6, 0},
            {4, 5, -4, -3},
            {5, 0, 5, 0}};
        
        
        escribe_matrices_ints(datos);
        System.out.println("--------------------------");
        int cuadrados[][]=cuadrados_matriz(datos);
        escribe_matrices_ints(cuadrados);

    }

    public static int[] lee_arreglo_enteros() {
        Scanner sc;
        int n;
        System.out.println("Digite el tamanho del arreglo?");
        sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Componente " + i + "-esima?");
            x[i] = sc.nextInt();
        }
        return x;
    }

    public static void escribe_arreglo_reales(int[] x) {
        int n = x.length;
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }

    public static int suma_arreglo_reales(int[] A) {
        int s = 0;
        for (int i = 0; i < A.length; i++) {
            s += A[i];
        }
        return s;
    }
    
    public static int prom_arreglo_reales(int[] A) {
        int s = 0;
        for (int i = 0; i < A.length; i++) {
            s += A[i];
        }
        return s/A.length;
    }

    public static int suma_arreglo_ints_iteracion(int[] A) {
        int s = 0;
        for (int x : A) {
            s += x;
        }
        return s;
    }

    public static int pos_maximo(int[] A) {
        int m = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[m]) {
                m = i;
            }
        }
        return m;
    }

    //--------MATRICES--------------------
    public static void escribe_matrices_ints(int[][] M) {
        int filas = M.length;
        for (int i = 0; i < filas; i++) {
            int columnas = M[i].length;
            for (int j = 0; j < columnas; j++) {
                System.out.print(M[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static int[][] cuadrados_matriz(int[][] X) {
        int[][] Y = new int[X.length][X[0].length];
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                Y[i][j] = X[i][j] * X[i][j];
            }
        }
        return Y;
    }

}
