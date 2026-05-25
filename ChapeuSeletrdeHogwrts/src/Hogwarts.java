import java.util.Scanner;

public class Hogwarts {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 0) {

            // DADOS
            System.out.println("Digite o nome:");
            String nome = entrada.nextLine();

            System.out.println("Digite a idade:");
            int idade = entrada.nextInt();

            System.out.println("Coragem:");
            double coragem = entrada.nextDouble();

            System.out.println("Inteligencia:");
            double inteligencia = entrada.nextDouble();

            System.out.println("Ambicao:");
            double ambicao = entrada.nextDouble();

            System.out.println("Lealdade:");
            double lealdade = entrada.nextDouble();

            System.out.println("Estrategia:");
            double estrategia = entrada.nextDouble();

            System.out.println("Criatividade:");
            double criatividade = entrada.nextDouble();

            entrada.nextLine();

            // OBJETO
            Aluno aluno = new Aluno(
                    nome,
                    idade,
                    coragem,
                    inteligencia,
                    ambicao,
                    lealdade,
                    estrategia,
                    criatividade
            );

            // CALCULAR CASA
            aluno.calcularCasa();

            // EXIBIR
            System.out.println("\n===== RESULTADO =====");

            aluno.exibirInformacoes();

            // CONTINUAR
            System.out.println("\nDigite 0 para sair");
            System.out.println("Digite qualquer número para continuar");

            opcao = entrada.nextInt();

            entrada.nextLine();
        }

        entrada.close();
    }
}