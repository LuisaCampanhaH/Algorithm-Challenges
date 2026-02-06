package java;
// PROBLEMA 1003 - Simple Sum//
// LINK - (https://judge.beecrowd.com/en/problems/view/1003)//
// DESCRIÇAO: UMA SOMA SIMPLES DE DOIS NÚMEROS NATURAIS//
// INPUT: 30 10 //
// OUTPUT : SOMA: 40 //
// LINGUAGEM: JAVA //

import java.util.*;
import java.io.*;

import java.util.Scanner;

public class SimpleSum  {

    public static void main(String[] args) {
        int A;
        int B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}
