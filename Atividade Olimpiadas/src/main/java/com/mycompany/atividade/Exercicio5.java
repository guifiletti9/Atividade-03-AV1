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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int N1, D1, V1, N2, D2, V2;

        double tempo1, tempo2;

        System.out.println("Digite o numero da primeira charrete: ");
        N1 = ler.nextInt();

        System.out.println("Digite a distancia da primeira charrete: ");
        D1 = ler.nextInt();

        System.out.println("Digite a velocidade da primeira charrete: ");
        V1 = ler.nextInt();

        System.out.println("Digite o numero da segunda charrete: ");
        N2 = ler.nextInt();

        System.out.println("Digite a distancia da segunda charrete: ");
        D2 = ler.nextInt();

        System.out.println("Digite a velocidade da segunda charrete: ");
        V2 = ler.nextInt();

        tempo1 = (double) D1 / V1;
        tempo2 = (double) D2 / V2;

        if (tempo1 < tempo2) {
            System.out.println(N1);
        } else {
            System.out.println(N2);
        }
    }
}