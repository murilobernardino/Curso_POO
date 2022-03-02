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
public class PrimitivoVsObjeto {
  
  public static void main(String[] args) {
    
    String s = new String ("Texto"); //String = classe "Texto" = Objeto
    s.toUpperCase();
    
    //Wrappers são a versão Objeto dos tipos primitivos!
    int a = 123;
    System.out.println(a);
    
    
  }
}
