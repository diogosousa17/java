package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DemoArrayList {

    static ArrayList<Integer> array = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void createArrayList() {
        array.add(112);
        array.add(34);
        array.add(99);
        array.add(12);
        array.add(500);
        System.out.println(array);
    }

    public static void limparArrayList() {
        array.clear();
        System.out.println(array);

    }

    public static void procurarElemento() {
        int numero;
        System.out.print("Introduza o número a procurar: ");
        numero = scanner.nextInt();

        if(array.contains(numero)) {
            System.out.println("O número que introduziu está na posição: " + (array.indexOf(numero)+1));
        }else {
            System.out.println("O número introduzido não existe!");
        }
    }

    public static void nSmino() {
        int posicao;
        int numero;
        System.out.print("Introduza a posição do número a procurar: ");
        posicao = scanner.nextInt();

        try {
            numero = array.get(posicao);
            System.out.println("O número da posição " + posicao + " é: " + numero);
        }catch(Exception e) {
            System.out.println("O número introduzido não existe!");
        }
    }

    public static void ordenarArray() {
        int numero;
        Collections.sort(array);
        System.out.println("Array ordenada: " + array);
    }

    public static void binarySearch() {
        int numero;
        System.out.print("Introduza o número a procurar: ");
        numero = scanner.nextInt();
        Collections.sort(array);

        int procura = Collections.binarySearch(array, numero);

        if(procura >= 0)
            System.out.println("O número introduzido está na posição: " + (procura+1));
        else
            System.out.println("O número não foi encontrado!");

    }

    public static void removerElemento() {
        int numero;
        int posicao;
        System.out.print("Introduza o número a remover: ");
        numero = scanner.nextInt();

        if(array.contains(numero)) {
            posicao = array.indexOf(numero);
            array.remove(posicao);
            System.out.println("Número removido com sucesso!");
            System.out.println("Array atualizada: " + array);
        }else {
            System.out.println("O número introduzido não existe!");
        }
    }

































}
