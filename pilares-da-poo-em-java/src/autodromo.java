public class autodromo {

    public static void main(String[] args) {
        carro jeep = new carro();
        /*jeep.confereCambio();
        jeep.confereCombustivel();*/
        jeep.setChassi("123456");
        //jeep.Ligar();

        moto z400 = new moto();
        z400.setChassi("215757");
        //z400.Ligar();

        veiculo coringa = z400;
        coringa.Ligar();
    }
}