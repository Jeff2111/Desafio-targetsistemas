import java.util.Scanner;
import java.util.ArrayList;

public class Questao_1_Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            
        // Digitar o número e lê o número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

    
        // Adiciona os dois primeiros números da sequência de Fibonacci
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        while (fibonacci.get(fibonacci.size() - 1) < numero * 2) {
            fibonacci.add(fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2));
        }
            // Verifica se o número digitado está na sequência de Fibonacci
        if (fibonacci.contains(numero)) {
            // Se estiver, imprimir que o número pertence à sequência
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            // Se não estiver, imprimir que o número não pertence à sequência
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
  }
}
