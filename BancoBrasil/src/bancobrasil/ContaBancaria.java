package bancobrasil;

public class ContaBancaria {

    //Atributos da classe
    String agencia;
    String conta;
    double saldo;
    Usuario proprietario;

    void depositar(double valor) {// Metodo com parametro
        this.saldo += valor;
    }

    void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void transferir(ContaBancaria contabancaria, double valor) {
        if (saldo >= valor) {
            this.sacar(valor);
            contabancaria.saldo += valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    String consultarSaldo() {// Metodo sem parametro
        // String.format método de classe String para utilizar formação com identificadores (%d, %f, %s).
        return String.format("Seu saldo é: R$ %.2f", this.saldo);
    }
}
