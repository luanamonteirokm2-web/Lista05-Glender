public class Aluno {

    // ATRIBUTOS
    private String nome;
    private int idade;

    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double estrategia;
    private double criatividade;

    private String casa;

    // CONSTRUTOR
    public Aluno(String nome, int idade,
                  double coragem,
                  double inteligencia,
                  double ambicao,
                  double lealdade,
                  double estrategia,
                  double criatividade) {

        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
    }

    // MÉTODO CALCULAR CASA
    public void calcularCasa() {

        double grifinoria =
                (2 * coragem) + lealdade;

        double sonserina =
                (2 * ambicao) + estrategia;

        double corvinal =
                (2 * inteligencia) + criatividade;

        double lufalufa =
                ((2 * lealdade) + coragem) / 3;

        // VERIFICAR MAIOR PONTUAÇÃO

        if (grifinoria >= sonserina &&
            grifinoria >= corvinal &&
            grifinoria >= lufalufa) {

            casa = "Grifinoria";
        }

        else if (sonserina >= grifinoria &&
                 sonserina >= corvinal &&
                 sonserina >= lufalufa) {

            casa = "Sonserina";
        }

        else if (corvinal >= grifinoria &&
                 corvinal >= sonserina &&
                 corvinal >= lufalufa) {

            casa = "Corvinal";
        }

        else {

            casa = "Lufa-Lufa";
        }
    }

    // EXIBIR INFORMAÇÕES
    public void exibirInformacoes() {

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);

        System.out.println("Casa: " + casa);
    }

    // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
}