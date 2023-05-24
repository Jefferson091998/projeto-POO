package bancobrasil;

import java.util.Date;

public class Usuario {
    
   private String nome;
   private String sobrenome;
   private String telefone;
   Usuario(){
    }
    Usuario(String n,String sob,String tele){
        this.nome=n;
        this.sobrenome=sob;
        this.telefone=tele;
    }
    
   
   public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String s){
        this.sobrenome=s;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String t){
        this.telefone=t;
    }
   
    
    
    
    public String imprimirInfo(){
        return String.format(" Nome: %s \nSobrenome: %s \nTelefone: %s \n",this.nome,this.sobrenome,this.telefone);
    }
}
