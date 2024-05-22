public class usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        smartTv SmartTv = new smartTv();

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();

        
        System.out.println("Canal Atual : " +SmartTv.canal);
        SmartTv.mudarCanal(13);
        System.out.println("Canal atual : " +SmartTv.volume);
        System.out.println("Volume atual : " +SmartTv.volume);


        System.out.println("TV ligada ? " +SmartTv.ligada);
        System.out.println("Volume atual : " +SmartTv.volume);
        System.out.println("Canal Atual : " +SmartTv.canal);
        System.out.println("Canal Atual : " +SmartTv.volume);

        SmartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ? " + SmartTv.ligada);

        SmartTv.desligar ();
        System.out.println("Novo Status -> TV Ligada ? " + SmartTv.ligada);
    }
}
