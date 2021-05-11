package com.company;

import java.util.Scanner;

public class DemoArray {
    public static int[] array = new int[5];

    public static void criarArray() {
        array[0] = 10;
        array[1] = 11;
        array[2] = 12;
        array[3] = 0;
        array[4] = 0;
    }

    public static void limparArray() {
        for(int i = 0; i < array.length; i++) {
            array[i] = 0;
            System.out.println(array[i]);
        }
    }

    public static void procurarArray() {
        int numero;
        Boolean encontrou = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o número a procurar: ");
        numero = scanner.nextInt();

        for(int i = 0; i < array.length; i++) {
            if(numero == array[i]) {
                encontrou = true;
                System.out.println("O número introduzido está na posição " + i);
            }
        }
        if(encontrou == false) {
            System.out.println("O número introduzido não existe!");
        }
    }

    public static void nSimo() {
        int numero;
        Boolean encontrou = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza a posição do número a procurar: ");
        numero = scanner.nextInt();

        for(int i = 0; i < array.length; i++) {
            if(numero == i) {
                encontrou = true;
                System.out.println("O número da posição " + i + " é: " + array[i]);
            }
        }
        if(encontrou == false) {
            System.out.println("Não existe esse número nessa posição!");
        }
    }

    public static void bubbleSort() {
        int aux = 0;

        for(int i = 0; i < array.length; i++) {
            for( int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void binarySearch() {
        int aux = 0;

        for(int i = 0; i < array.length; i++) {
            for( int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        int numero;
        int first = 0;
        int last = array.length;
        int mid = (first + last)/2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o número a procurar: ");
        numero = scanner.nextInt();

        while(first <= last) {
            if(array[mid] < numero ) {
                first = mid + 1;
            }else if(array[mid] == numero) {
                System.out.println("O número foi encontrado na posição " + (mid+1));
                break;
            }else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if(numero != mid) {
            System.out.println("O número não foi encontrado!");
        }
    }

    public static void removerElemento() {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o número a remover: ");
        numero = scanner.nextInt();

        for(int i = 0; i < array.length; i++) {
            if(numero == array[i]) {
                array[i] = 0;
                System.out.println("O número " + numero + " foi removido!");
            }
        }
    }

    public static void elementoRepetido() {
        int x = 0;
        boolean encontrou = false;
        for(int i = 0; i < 5; i++) {
            for(int j = i+1; j < 5; j++) {
                if(array[j] == array[i]) {
                    encontrou = true;
                }
            }
        }if(encontrou == true) {
            System.out.println("Existem números repetidos na array!");
        }
        if(encontrou == false) {
            System.out.println("Não existem números repetidos!");
        }
    }

    public static void espacoLivre() {

        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                System.out.println("A posição " + (i+1) + " está livre!");
            }
        }
    }

    public static void aumentarArray() {
        int[] array2 = new int[array.length*2];

        for(int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
        for(int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}