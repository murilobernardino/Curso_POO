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
public class Wrapper {
  
  public static void main(String[] args) {
    
    //byte
    Byte b = 100; //byte
    Short s = 1000;
    
    //Integer.parseInt converteu uma String em Inteiro
    Integer i = Integer.parseInt("10000"); //int 
    Long l = 100000L;
    
    System.out.println(b.byteValue());
    System.out.println(s.toString());
    System.out.println(i * 3);
    System.out.println(l / 3);
    
    Float f = 123.02F;
    System.out.println(f);
    
    Double d = 1234.5678;
    System.out.println(d);
    
    Boolean bo = Boolean.parseBoolean("true"); //converteu uma String para Boolean
    System.out.println(bo);
    System.out.println(bo.toString().toUpperCase()); //converteu um boolean para String
    
    Character c = '#'; //char
    System.out.println(c.toString());
  }
}
