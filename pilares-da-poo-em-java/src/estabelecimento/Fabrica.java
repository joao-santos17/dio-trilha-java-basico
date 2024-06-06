package estabelecimento;

import equipamentos.Multifuncional.EquipamentoMultifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class Fabrica {
    private static final Digitalizadora Scanner = null;

    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = Scanner;
        Copiadora copiadora = em;

        impressora.Imprimir();
        digitalizadora.digitalizar();
        copiadora.Copiar();
    }
}
