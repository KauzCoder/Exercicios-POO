public class Endereço {
    private String rua;
    private int numero;

    public Endereco(String r, int n) {
        rua = r;
        numero = n;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }
}

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String n, int i, Endereco e) {
        nome = n;
        idade = i;
        endereco = e;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua A", 100);
        Endereco e2 = new Endereco("Rua B", 200);

        Pessoa p1 = new Pessoa("Grace", 20, e1);
        Pessoa p2 = new Pessoa("Paulo", 19, e2);

        p1.mostrarDados();
        p2.mostrarDados();
    }
}
