package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional multiF = new EquipamentoMultifuncional();

        Impressora impressora = multiF;
        Digitalizadora digitalizadora = multiF;
        Copiadora copiadora = multiF;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }

}
