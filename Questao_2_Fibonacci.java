import java.util.Scanner;
import java.util.ArrayList;

public class Questao_2_Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        while (fibonacci.get(fibonacci.size() - 1) < numero * 2) {
            fibonacci.add(fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2));
        }

        if (fibonacci.contains(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
  }
}
