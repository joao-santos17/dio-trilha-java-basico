package equipamentos.Multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void Copiar() {
        // TODO Auto-generated method stub
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");

    }

    public void digitalizar(){
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");

    }

    public void Impressora(){
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");

    }

    
    public void Imprimir() {
        // TODO Auto-generated method stub
    }

}
