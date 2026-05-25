import java.util.Scanner;

public class ProjetoIMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        String sobrenome;
        int idade;
        double altura;
        double peso;

        // ENTRADAS
        System.out.println("Digite o nome:");
        nome = entrada.nextLine();

        System.out.println("Digite o sobrenome:");
        sobrenome = entrada.nextLine();

        System.out.println("Digite a idade:");
        idade = entrada.nextInt();

        System.out.println("Digite a altura:");
        altura = entrada.nextDouble();

        System.out.println("Digite o peso:");
        peso = entrada.nextDouble();

        // OBJETO
        Pessoa p1 = new Pessoa(
                nome,
                sobrenome,
                idade,
                altura,
                peso
        );

        // CALCULAR IMC
        p1.CalculaIMC();

        // RESULTADO
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Sobrenome: " + p1.getSobrenome());

        System.out.println("IMC: " + p1.getImc());

        System.out.println("Classificação: "
                + p1.InformaObesidade());

        entrada.close();
    }
}