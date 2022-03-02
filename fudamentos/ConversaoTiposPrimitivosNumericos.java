/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fudamentos;

/**
 *
 * @author alpha7
 */
public class ConversaoTiposPrimitivosNumericos {
  
  public static void main(String[] args) {
    
    double a = 1; //conversão implicta
    System.out.println(a);
    
    float b = (float)1.234; //conversão explicita (CAST)
    System.out.println(b);
    
    int c = 4;
    byte d = (byte)c;
    System.out.println(d); //conversão explícita (CAST)
    
    double e = 1;
    int f = (int)e;
    System.out.println(f); //conversão explícita (CAST)
  }
}
