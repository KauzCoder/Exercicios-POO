import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Instancia o objetos com dados preenchidos
        ProjetoAluno aluno = new ProjetoAluno();
        ProjetoCarro carro = new ProjetoCarro();
        ProjetoBanco conta = new ProjetoBanco();

        System.out.println(
                "░██████╗░█████╗░██╗███████╗███╗░░██╗░█████╗░██╗████╗\n" +
                        "██╔════╝██╔══██╗██║██╔════╝████╗░██║██╔══██╗║██╔════╝\n" +
                        "╚█████╗░██║░░╚═╝██║█████╗░░██╔██╗██║██║░░╚═╝║█████╗░░\n" +
                        "░╚═══██╗██║░░██╗██║██╔══╝░░██║╚████║██║░░██╗║██╔══╝░░\n" +
                        "██████╔╝╚█████╔╝██║███████╗██║░╚███║╚█████╔╝║███████╗\n" +
                        "╚═════╝░░╚════╝░╚═╝╚══════╝╚═╝░░╚══╝░╚════╝░╚═╝╚══════╝\n" +
                        "\n" +
                        "░█████╗░░█████╗░███╗░░░███╗██████╗░██╗░░░██╗████████╗███████╗██████╗░  ░░░░░░\n" +
                        "██╔══██╗██╔══██╗████╗░████║██╔══██╗██║░░░██║╚══██╔══╝██╔════╝██╔══██╗  ░░░░░░\n" +
                        "██║░░╚═╝██║░░██║██╔████╔██║██████╔╝██║░░░██║░░░██║░░░█████╗░░██████╔╝  █████╗\n" +
                        "██║░░██╗██║░░██║██║╚██╔╝██║██╔═══╝░██║░░░██║░░░██║░░░██╔══╝░░██╔══██╗  ╚════╝\n" +
                        "╚█████╔╝╚█████╔╝██║░╚═╝░██║██║░░░░░╚██████╔╝░░░██║░░░███████╗██║░░██║  ░░░░░░\n" +
                        "░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚═╝░░░░░░╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚═╝  ░░░░░░\n");

        int maxGrupos = 10;

        System.out.println("\nCarregando programa:");

        for (int i = 1; i <= maxGrupos; i++) {
            printBarra(i);
            Thread.sleep(300);
        }
        System.out.println("\nPrograma iniciado.");
        System.out.println("╔════════════════════════════════════════════╗\n" +
                "║          \uD83D\uDCCC FUNÇÕES 2 SLIDE POO \uD83D\uDCCC         ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "║  [1]  Números menores que o digitado       ║\n" +
                "║       (ordem decrescente)                  ║\n" +
                "║                                            ║\n" +
                "║  [2]  Ler 5 valores e indicar se < 10      ║\n" +
                "║                                            ║\n" +
                "║  [3]  Mostrar pares de 1 a 50              ║\n" +
                "║                                            ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "║               PROJETO ALUNO                ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "║  [4]  Mostrar dados do aluno               ║\n" +
                "║                                            ║\n" +
                "║  [5]  Calcular a media                     ║\n" +
                "║                                            ║\n" +
                "║  [6]  Verificar boletim da UNAMA           ║\n" +
                "║                                            ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "║               PROJETO CARRO                ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "║  [7]  Mostrar as informacoes do carro      ║\n" +
                "║                                            ║\n" +
                "║  [8]  Ligar o carro e acelarar             ║\n" +
                "║                                            ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "║               PROJETO BANCO                ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "║  [9]   Informações da conta                ║\n" +
                "║                                            ║\n" +
                "║  [10]  Depositar                           ║\n" +
                "║                                            ║\n" +
                "║  [11]  Sacar                               ║\n" +
                "║                                            ║\n" +
                "║  [12]  Consultar saldo                     ║\n" +
                "║                                            ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "                                              \n" +
                "(☞ﾟヮﾟ)☞ Escolha uma opção:");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.printf("Informe o número: ");
                int numeroDecrementado = scanner.nextInt();
                NumerosDecrecentes numeros = new NumerosDecrecentes();
                numeros.exibeNumerosDescrescentes(numeroDecrementado);
                break;
            case 2:
                NumerosMenoresQueDez lista = new NumerosMenoresQueDez();
                lista.adicionaCincoItensNaLista();
                lista.verificarMenoresQueDez();
                break;
            case 3:
                NumerosPares numeroComResto = new NumerosPares();
                System.out.println("Numero pares no intervalo de 1 a 50:");
                numeroComResto.ExibeNumerosParesDeUmACinquenta();
                break;
            case 4:
                aluno.exibeInformacoesAluno();
                break;
            case 5:
                aluno.calculaMediaAluno();
                break;
            case 6:
                aluno.mostraBoletim();
                break;
            case 7:
                carro.dadosCarro();
                break;
            case 8:
                carro.aceleraCarro();
                break;
            case 9:
                conta.informacoesSaldoeConta();
                break;
            case 10:
                System.out.print("Digite o valor a depositar: R$ ");
                double valorDeposito = scanner.nextDouble();
                conta.depositaValor(valorDeposito);
                break;
            case 11:
                System.out.print("Digite o valor a sacar: R$ ");
                double valorSaque = scanner.nextDouble();
                conta.sacaSaldo(valorSaque);
                break;
            default:
                System.out.println("Opção invalida!");
        }
    }

    private static void printBarra(int grupos) {
        StringBuilder barra = new StringBuilder();
        for (int j = 0; j < grupos; j++) {
            barra.append("🔲🔲🔲");
        }
        System.out.print("\r" + barra.toString() + "    ");
    }
}
