import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosMenoresQueDez {
    Scanner scanner = new Scanner(System.in);
    List<Integer> listaDeNumerosInteiros = new ArrayList<>();

    void adicionaCincoItensNaLista() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int item = scanner.nextInt();
            listaDeNumerosInteiros.add(item);
        }
    }

    void verificarMenoresQueDez() {
        System.out.println("\nNúmeros menores que 10:");
        for (int i = 0; i < listaDeNumerosInteiros.size(); i++) {
            int numero = listaDeNumerosInteiros.get(i); // pega o elemento pelo índice
            if (numero < 10) {
                System.out.println("Índice " + i + ": " + numero);
            }
        }
    }
}