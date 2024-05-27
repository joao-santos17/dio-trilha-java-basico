public class formatadorcepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("04242120");
            System.out.println(cepFormatado);
        } catch (cepinvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("O CEP não corresponde as regras de negócio!!");

        }
    }
     
    static String formatarCep(String cep) throws cepinvalidoException{
        if(cep.length() != 8)
          throw new cepinvalidoException();
        
          //simulando um cep formatado
          return "04.242-120";
          
    }

}
