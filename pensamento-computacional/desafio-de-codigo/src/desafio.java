import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {
        //Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);

        System.out.println("Digite o valor do salário do funcionário: ");
        float valorSalario = leitorDeEntradas.nextFloat();

        System.out.println("Digite o valor total dos benefício funcionário: ");  
        float valorBeneficios = leitorDeEntradas.nextFloat();
        
        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {    
            //Atribui a aliquota  de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
            
            System.out.println("Será cobrado 5% de imposto mediante o salário.");
        }else if (valorSalario > 1100 && valorSalario <= 2500) {
            //Atribui a aliquota  de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario;
            System.out.println("Será cobrado 10% de imposto mediante o salário.");
            
        }else { 
            //Atribui a aliquota  de 15% mediante o salário:
            valorImposto = 0.15F * valorSalario;
            System.out.println("Será cobrado 15% de imposto mediante o salário.");
        }

        /*TODO Criar a demais condições para as aliquotas de 10.00% e 15.00%.
        Calcula e imprima a Saída (com 2 casas decimais)*/
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}