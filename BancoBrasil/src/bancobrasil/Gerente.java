/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancobrasil;

public class Gerente extends Usuario {

    private String login;
    private String password;

    public Gerente() {
    }

    public Gerente(String login, String password, String n, String sob, String tele) {
        this.setNome(n);
        this.setSobrenome(sob);
        this.setTelefone(tele);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String imprimirInfo(){
        return String.format("Informaçoes do Gerente"+"Nome: %s %s\n"+"Contato: %s\n"+"Login: %s",this.getNome(),this.getSobrenome(),this.getTelefone(),this.getLogin());
    }

}
