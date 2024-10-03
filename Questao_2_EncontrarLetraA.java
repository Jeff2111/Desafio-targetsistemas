import java.util.Scanner;

public class Questao_2_EncontrarLetraA {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada da palavra
        System.out.print("Digite uma palavra: ");
        String texto = scanner.nextLine();

        // Converte o texto para letras minúsculas
        String textoLower = texto.toLowerCase();

        // Percorre cada caractere da string e encontrar a letra "a" incluindo a letra com caractere
        int contador = 0;
        
        for (int i = 0; i < textoLower.length(); i++) {
             char caractere = textoLower.charAt(i);
                if (caractere == 'a' || caractere == 'á' || caractere == 'â' || caractere == 'ã' || caractere == 'à') {
                    contador++;
                    }
                }
        
        // Imprimir a quantidade de vezes que a letra "a" aparece
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        scanner.close();
    }
}
