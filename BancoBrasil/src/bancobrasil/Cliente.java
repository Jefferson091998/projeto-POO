
package bancobrasil;

import java.util.Date;

public class Cliente extends Usuario{
    private Date dataRegistro = new Date();

    public Cliente() {
    }

    public Cliente(String n, String sob, String tele) {
        super(n, sob, tele);
    }
    
     public Date getDataRegistro(){
        return this.dataRegistro;
    }
    public void setDataRegistro(Date d){
        this.dataRegistro=d;
    }

    @Override
    public String imprimirInfo() {
         return String.format(" Nome: %s \nSobrenome: %s \nTelefone: %s \nData de Registro %s",super.getNome(),super.getSobrenome(),super.getTelefone(),this.dataRegistro);
    }

    
    
}
