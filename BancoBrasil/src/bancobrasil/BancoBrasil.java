package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
        //Instanciando objetos do tipo ContaBancaria e referenciamdonas variaveis contaBancaria1 e contaBancaria2
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
        Usuario user1 = new Usuario();
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
        
        //Construção e inserção de dados do usuario
        System.out.println("\nDados do Usuário ");
        System.out.print("Digite o nome do cliente -> ");
        user1.nome = input.next();
        System.out.print("Digite o sobrenome do cliente -> ");
        user1.sobrenome = input.next();
        System.out.print("Digite o telefone do cliente -> ");
        user1.telefone = input.next();
        contaBancaria1.proprietario = user1;
        
        System.out.print("\nDigite o valor de deposito ->");
        contaBancaria1.depositar(input.nextDouble());
        //Exibindo os valores atribuidos
        System.out.println("Agencia: " + contaBancaria1.agencia);
        System.out.println("Conta: " + contaBancaria1.conta);
        System.out.println("Proprietario: " + contaBancaria1.proprietario.imprimirInfo());
        System.out.println(contaBancaria1.consultarSaldo());
        
        System.out.print("\n\n Digite o valor para saque -> ");
        contaBancaria1.sacar(input.nextDouble());
        
        System.out.println(contaBancaria1.consultarSaldo());
    }

}
