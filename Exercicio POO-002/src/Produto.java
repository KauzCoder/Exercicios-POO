public class Produto {
    private String nome;
    private double preco;

    public Produto(String n, double p) {
        nome = n;
        setPreco(p);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setPreco(double p) {
        if (p >= 0) {
            preco = p;
        } else {
            System.out.println("Preço inválido, não pode ser negativo.");
        }
    }

    public static void main(String[] args) {
        Produto prod1 = new Produto("Notebook", 3000.0);
        System.out.println(prod1.getNome() + " - R$" + prod1.getPreco());

        prod1.setPreco(-500.0); // tentativa inválida
        System.out.println(prod1.getNome() + " - R$" + prod1.getPreco());

        Produto prod2 = new Produto("Mouse", -50.0); // inicialização inválida
        System.out.println(prod2.getNome() + " - R$" + prod2.getPreco());

        prod2.setPreco(100.0); // agora válido
        System.out.println(prod2.getNome() + " - R$" + prod2.getPreco());
    }
}
