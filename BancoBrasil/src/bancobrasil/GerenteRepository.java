
package bancobrasil;

import java.util.ArrayList;

public class GerenteRepository {
    public ArrayList<Gerente> gerente = new ArrayList<>();
    
    public ArrayList<Gerente> addGerente(){
        gerente.add(new Gerente("jeff","12345","Jefferson","Fortes","12345"));
        gerente.add(new Gerente("teste","teste","test","test",""));
        return gerente;
    }
}
