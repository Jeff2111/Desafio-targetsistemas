import java.util.Scanner;

public class Questao_5_InverterString {

    public static void main(String[] args) {
        // Digitar uma string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String original = scanner.nextLine();
        scanner.close();

        // Chamar o método que inverte a string
        String invertida = inverterString(original);

        // Imprime a string invertida
        System.out.println("Palavra invertida: " + invertida);
    }

    public static String inverterString(String str) {
        // Cria um array de caracteres a partir da string
        char[] caracteres = str.toCharArray();

        // Percorre o array de trás para frente e reconstrói a string invertida
        String invertida = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }

        return invertida;
    }
}
