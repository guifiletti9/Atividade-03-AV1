/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author fef
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int N, quantidade;

        System.out.println("Digite o valor de N: ");
        N = ler.nextInt();

        quantidade = (N + 1) * (N + 2) / 2;

        System.out.println("Resultado: " + quantidade);
    }
}