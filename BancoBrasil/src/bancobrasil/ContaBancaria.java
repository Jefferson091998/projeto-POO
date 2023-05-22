package bancobrasil;

public class ContaBancaria {

    //Atributos da classe
    private String agencia;
    private String conta;
    private double saldo;
    private Usuario proprietario;
    
    ContaBancaria() {
    }

    ContaBancaria(String a,String c,double s,Usuario p) {
        this.agencia=a;
        this.conta=c;
        this.saldo=s;
        this.proprietario=p;
    }
    
    public String getAgencia(){
        return this.agencia;
    }
    public void setAgencia(String a){
        this.agencia=a;
    }
    public String getConta(){
        return this.conta;
    }
    public void setConta(String c){
        this.conta=c;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double s){
        this.saldo=s;
    }
    public Usuario getProprietario(){
        return this.proprietario;
    }
    public void setProprietario(Usuario p){
        this.proprietario=p;
    }


    
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
