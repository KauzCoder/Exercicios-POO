public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int n, double s) {
        numeroConta = n;
        saldo = s;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1234, 500.0);

        c1.depositar(200.0);
        System.out.println("Saldo: " + c1.getSaldo());

        c1.sacar(100.0);
        System.out.println("Saldo: " + c1.getSaldo());

        c1.sacar(700.0);
        System.out.println("Saldo: " + c1.getSaldo());
    }
}
