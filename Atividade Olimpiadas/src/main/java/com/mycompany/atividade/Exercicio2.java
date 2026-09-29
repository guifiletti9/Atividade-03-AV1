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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char[] resultados = new char[6];
        int vitorias = 0;

        for (int i = 0; i < 6; i++) {
            resultados[i] = ler.next().charAt(0);

            if (resultados[i] == 'V') {
                vitorias++;
            }
        }

        if (vitorias >= 5) {
            System.out.println("1");
        } else if (vitorias >= 3) {
            System.out.println("2");
        } else if (vitorias >= 1) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}
