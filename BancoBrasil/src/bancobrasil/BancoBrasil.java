package bancobrasil;

import java.util.Scanner;


public class BancoBrasil {

    
    public static void main(String[] args) {
        //Instanciando objetos do tipo ContaBancaria e referenciamdonas variaveis contaBancaria1 e contaBancaria2
       ContaBancaria contaBancaria1 = new ContaBancaria();
       ContaBancaria contaBancaria2 = new ContaBancaria();
      
       //Atrinuindo valores ao nosso objeto
//       contaBancaria1.agencia = "0001";
//       contaBancaria1.conta = "12345";
//       contaBancaria1.proprietario = "Junior";
//       contaBancaria1.saldo = 1.99;
       
       //Exibindo os valores atribuidos
//        System.out.println("Agencia: "+contaBancaria1.agencia);
//        System.out.println("Conta: "+contaBancaria1.conta);
//        System.out.println("Proprietario: "+contaBancaria1.proprietario);
//       System.out.println("Saldo: "+contaBancaria1.saldo);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("BEM-VINDO AO BANCO DO BRASIL");
        System.out.println("CADASTRO DE CONTA");
        System.out.print("Digite a agência ->");
        contaBancaria1.agencia = input.next();
        System.out.print("\nDigite a conta ->");
        contaBancaria1.conta = input.next();
        System.out.print("\nDigite o proprietario ->");
        contaBancaria1.proprietario = input.next();
        System.out.print("\nDigite o saldo ->");
        contaBancaria1.saldo = input.nextDouble();
                  //Exibindo os valores atribuidos
        System.out.println("Agencia: "+contaBancaria1.agencia);
        System.out.println("Conta: "+contaBancaria1.conta);
        System.out.println("Proprietario: "+contaBancaria1.proprietario);
       System.out.println("Saldo: "+contaBancaria1.saldo);
    }
    
}
