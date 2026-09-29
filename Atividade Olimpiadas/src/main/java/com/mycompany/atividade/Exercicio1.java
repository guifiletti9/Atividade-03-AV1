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
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade1, idade2, idade3, camila;

        System.out.println("Digite a primeira idade: ");
        idade1 = ler.nextInt();

        System.out.println("Digite a segunda idade: ");
        idade2 = ler.nextInt();

        System.out.println("Digite a terceira idade: ");
        idade3 = ler.nextInt();

        if (idade1 >= idade2 && idade1 <= idade3) {
            camila = idade1;
        } else if (idade1 >= idade3 && idade1 <= idade2) {
            camila = idade1;
        } else if (idade2 >= idade1 && idade2 <= idade3) {
            camila = idade2;
        } else {
            camila = idade3;
        }

        System.out.println("Idade de Camila: " + camila);
    }
}