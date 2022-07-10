package SistemasDeArmas;

import SistemasDeArmas.SistemaArmas;
import com.company.Mostrador;

public class Tanque extends SistemaArmas implements Mostrador {

    public Tanque(Integer energia) {
        super(energia);
    }

    @Override
    public void mostrarse() {
        System.out.println("Me muestro");
    }
}
