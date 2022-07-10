package SistemasDeArmas;

import SistemasDeArmas.SistemaArmas;
import com.company.Mostrador;
import com.company.Volador;

public class RobotPesado extends SistemaArmas implements Mostrador, Volador {

    public RobotPesado(Integer energia) {
        super(energia);
    }

    @Override
    public void mostrarse() {
        System.out.println("Me muestro");
    }

    @Override
    public void volar() {
        System.out.println("Vuelo");
    }
}
