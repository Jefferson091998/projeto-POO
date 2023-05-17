package bancobrasil;

import java.util.Date;

public class Usuario {
    
    String nome;
    String sobrenome;
    String telefone;
    Date dataRegistro = new Date();
    
    String imprimirInfo(){
        return String.format(" Nome: %s \nSobrenome: %s \nTelefone: %s \nData de Registro %s",this.nome,this.sobrenome,this.telefone,this.dataRegistro);
    }
}
