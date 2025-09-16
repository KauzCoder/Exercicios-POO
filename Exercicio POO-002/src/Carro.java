public class Carro {
    private String marca;
    private int ano;

    public Carro(String m, int a) {
        marca = m;
        ano = a;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota", 2020);

        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Ano: " + c1.getAno());
    }
}
