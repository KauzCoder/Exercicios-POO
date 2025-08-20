public class ProjetoBanco {
    String numeroConta = "12345-6";
    String nomeTitular = "Emerson Kaua";
    String cpfTitular = "123.456.789-00";
    double saldo = 2500.75;
    String tipoConta = "Corrente";

    void depositaValor(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    void sacaSaldo(double valor){
        if (valor > 0 && valor <= saldo){
        saldo-=valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    void informacoesSaldoeConta() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("CPF: " + cpfTitular);
        System.out.println("Tipo: " + tipoConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}
