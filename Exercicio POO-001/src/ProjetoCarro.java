import java.util.Scanner;

public class ProjetoCarro {
    Scanner scanenr = new Scanner(System.in);

    String tipoDeMotor = "V6";
    String donoDoCarro = "Emerson Kaua";

    String marca = "Toyota";
    String modelo = "Corolla";
    String cor = "Prata";
    int anoFabricacao = 2022;
    String placa = "BEL-2025";
    String chassi = "9BWZZZ377VT004251";
    double quilometragem = 15800.5;
    String tipoCombustivel = "Flex";

    boolean ligado;
    boolean acelararCarro;


    void aceleraCarro() {
        while (true) {
            double chance = Math.random();

            if (chance < 0.33) { // 33% de chance de ligar
                System.out.println("O motor ligou!");
                System.out.println("Deseja acelerar o carro para sair da garagem? (Sim/Não)");
                String verificador = scanenr.nextLine();

                if (verificador.equalsIgnoreCase("sim")) {
                    System.out.println("Você acelerou o carro e saiu da garagem!");
                    break;
                } else {
                    System.out.println("Você decidiu não acelerar. Motor desligado.");
                    break;
                }
            } else {
                System.out.println("Falha ao ligar o motor.");
                System.out.println("Deseja tentar ligar o carro novamente? (Sim/Não)");
                String tentar = scanenr.nextLine();
                if (tentar.equalsIgnoreCase("não")) {
                    System.out.println("Você desistiu de ligar o carro.");
                    break;
                }
            }
        }
    }

    void dadosCarro(){
        System.out.println("===== FICHA DO CARRO =====");
        System.out.println("Dono do carro: " + donoDoCarro);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Placa: " + placa);
        System.out.println("Chassi: " + chassi);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Tipo de combustível: " + tipoCombustivel);
        System.out.println("Tipo de motor: " + tipoDeMotor);
        System.out.println("==========================");
    }
}