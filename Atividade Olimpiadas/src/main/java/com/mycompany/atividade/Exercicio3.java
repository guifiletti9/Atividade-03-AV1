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
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int S, A, B, numero, digito, soma, quantidade = 0;

        System.out.println("Digite o valor de S: ");
        S = ler.nextInt();

        System.out.println("Digite o valor de A: ");
        A = ler.nextInt();

        System.out.println("Digite o valor de B: ");
        B = ler.nextInt();

        for (int i = A; i <= B; i++) {

            numero = i;
            soma = 0;

            while (numero > 0) {
                digito = numero % 10;
                soma = soma + digito;
                numero = numero / 10;
            }

            if (soma == S) {
                quantidade++;
            }
        }

        System.out.println("Resultado: " + quantidade);
    }
}
