import java.util.Scanner;

public class calculadoradeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        //System.out.println ("Média da Turma %1.f", media);
        System.out.println("Média da Turma foi de " + media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){

    double soma = 0;
    for (String aluno : alunos) {
        System.out.printf("Nota do aluno %s: ", aluno);
        double nota = scanner. nextDouble();
        soma += nota;
    }

    return soma / alunos.length;
    
}

}
