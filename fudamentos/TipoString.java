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
public class TipoString {
  
  public static void main(String[] args) {
    System.out.println("Olá pessoal".charAt(4));
    
    String s = "Boa tarde";
    System.out.println(s.concat("!!!"));
    System.out.println(s + "!!!");
    System.out.println(s.startsWith("Boa")); //valida se começa com Boa = True
    System.out.println(s.toLowerCase().startsWith("boa")); //converte a fonte para minuscula e valida se começa com boa = false
    System.out.println(s.endsWith("tarde")); //validada se termina com tarde = true
    System.out.println(s.length()); //retorna a quantidade de caracteres = 9
    System.out.println(s.equals("boa tarde")); //valida se String é igual a informada no .equals()
    System.out.println(s.equalsIgnoreCase("boa tarde")); //validade se a String é igual porém ignora a fonte maiuscula ou minuscula ** leva em consideração acentuação
    
    String nome = "Pedro"; //Java realiza a inferencia de identifica que é uma String
    String sobrenome = "Santos";
    int idade = 33;
    double salario = 3025.62;
    
    System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");
    
    System.out.printf("O Senhor %s %s tem %d anos e ganha %.2f \n",
        nome, sobrenome, idade, salario); //
    
    System.out.println("Frase qualquer".contains("qual")); //verifica se a String tem o valor informado no .contains()
    System.out.println("Frase qualquer".indexOf("qual")); //Verifica em qual incice o valor está = 6
    System.out.println("Frase qualquer".substring(6)); //imprime na tela a partir do indice indicado no .substring() = qualquer
    System.out.println("Frase qualquer".substring(6, 10)); //imprime na tela a partir do indice e até o indicado no .substring() = qual
  }
}
