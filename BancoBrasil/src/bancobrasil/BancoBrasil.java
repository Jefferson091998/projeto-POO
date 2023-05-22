package bancobrasil;

import java.util.Scanner;

public class BancoBrasil {

    public static void main(String[] args) {
//        //Instanciando objetos do tipo ContaBancaria e referenciamdonas variaveis contaBancaria1 e contaBancaria2
//        ContaBancaria contaBancaria1 = new ContaBancaria();
//        ContaBancaria contaBancaria2 = new ContaBancaria();
//        Usuario user1 = new Usuario();
//        //Atrinuindo valores ao nosso objeto
////       contaBancaria1.agencia = "0001";
////       contaBancaria1.conta = "12345";
////       contaBancaria1.proprietario = "Junior";
////       contaBancaria1.saldo = 1.99;
//        //Exibindo os valores atribuidos
////        System.out.println("Agencia: "+contaBancaria1.agencia);
////        System.out.println("Conta: "+contaBancaria1.conta);
////        System.out.println("Proprietario: "+contaBancaria1.proprietario);
////       System.out.println("Saldo: "+contaBancaria1.saldo);
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("BEM-VINDO AO BANCO DO BRASIL");
//        System.out.println("CADASTRO DE CONTA");
//        System.out.print("Digite a agência ->");
//        contaBancaria1.agencia = input.next();
//        System.out.print("\nDigite a conta ->");
//        contaBancaria1.conta = input.next();
//        
//        //Construção e inserção de dados do usuario
//        System.out.println("\nDados do Usuário ");
//        System.out.print("Digite o nome do cliente -> ");
//        user1.setNome(input.next());
//        System.out.print("Digite o sobrenome do cliente -> ");
//        user1.setSobrenome(input.next());
//        System.out.print("Digite o telefone do cliente -> ");
//        user1.setTelefone(input.next());
//        contaBancaria1.proprietario = user1;
//        
//        System.out.print("\nDigite o valor de deposito ->");
//        contaBancaria1.depositar(input.nextDouble());
//        //Exibindo os valores atribuidos
//        System.out.println("Agencia: " + contaBancaria1.agencia);
//        System.out.println("Conta: " + contaBancaria1.conta);
//        System.out.println("Proprietario: " + contaBancaria1.proprietario.imprimirInfo());
//        System.out.println(contaBancaria1.consultarSaldo());
//        
//        System.out.print("\n\n Digite o valor para saque -> ");
//        contaBancaria1.sacar(input.nextDouble());
//        
//        System.out.println(contaBancaria1.consultarSaldo());

        Scanner input = new Scanner(System.in);
        int opcao = 0;
        Usuario user;
        Usuario[] users = new Usuario[5];
        ContaBancaria contabancaria = new ContaBancaria();

        while (opcao != 3) {

            System.out.println("***BANCO BRASIL***");
            System.out.println("1- Cadastro de Cliente");
            System.out.println("2- Cadastro de Conta");
            System.out.println("3- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        user = new Usuario();
                        System.out.println("***CADASTRO DE CLIENTE***");
                        System.out.print("Nome: ");
                        user.setNome(input.next());
                        System.out.print("Sobrenome: ");
                        user.setSobrenome(input.next());
                        System.out.print("Telefone: ");
                        user.setTelefone(input.next());
                        users[i] = user;
                    }
                    break;
                case 2:
                    if(users[0] == null){
                        System.out.println("Cadastro do Cliente vazio");
                        break;
                    }
                    System.out.println("***CADASTRO DE CONTA***");
                    System.out.print("Agencia: ");
                    contabancaria.setAgencia(input.next());
                    System.out.print("Conta: ");
                    contabancaria.setConta(input.next());
                    System.out.println("CLIENTES CADASTRADOS");
                    for (int i = 0; i < 5; i++) {
                        System.out.printf("%d- %s %s\n",i,users[i].getNome(),users[i].getSobrenome());
                    }
                    System.out.println("Selecione o cliente: ");
                    int userOpcao = input.nextInt();
                    if(userOpcao<=5 && userOpcao>0){
                        userOpcao--;
                        contabancaria.setProprietario(users[userOpcao]);
                    }else{
                        System.out.println("Cliente Invalido");
                    }

                    break;

                case 3:
                    System.out.println("***ATE BREVE!***");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        }
    }

}
