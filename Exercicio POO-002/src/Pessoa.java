public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String n, int i) {
        nome = n;
        idade = i;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ryan", 20);
        Pessoa p2 = new Pessoa("Larissa", 19);

        System.out.println("Nome: " + p1.nome + ", Idade: " + p1.idade);
        System.out.println("Nome: " + p2.nome + ", Idade: " + p2.idade);
    }
}
