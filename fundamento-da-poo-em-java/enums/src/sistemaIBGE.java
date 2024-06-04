public class sistemaIBGE {
    public static void main(String[] args) {
        for(estadoBrasileiro e: estadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        estadoBrasileiro eb = estadoBrasileiro.PIAUI;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
    }
}
