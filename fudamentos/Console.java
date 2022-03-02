/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fudamentos;

import java.util.Scanner;

/**
 *
 * @author alpha7
 */
public class Console {
  
  public static void main(String[] args) {
    
    System.out.print("Bom");
    System.out.print(" Dia!\n");
    
    System.out.println("Bom");
    System.out.println("Dia");
    
    System.out.printf("Megasena: %d %d %d %d %d %d \n", 14, 55, 06, 38, 19, 43);
    System.out.printf("Sálario: %.1f%n%n", 1234.5678);
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite o seu nome: ");
    String nome = input.nextLine();
    System.out.print("Digite o seu sobrenome: ");
    String sobrenome = input.nextLine();
    System.out.print("Idade: ");
    int idade = input.nextInt();
    
    System.out.printf("%s %s tem %d anos. ",
        nome, sobrenome, idade);
    input.close();
  }
}
