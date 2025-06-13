import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada do usuário
        System.out.println("Digite uma palavra ou frase:");
        String palavra = sc.nextLine().toLowerCase(); // Ignora maiúsculas

        // 2. Mapa para contar frequência de letras
        Map<Character, Integer> frequencia = new HashMap<>();

        // 3. Loop sobre cada caractere
        for (char letra : palavra.toCharArray()) {
            if (Character.isLetter(letra)) { // Ignora espaços e pontuação
                frequencia.put(letra, frequencia.getOrDefault(letra, 0) + 1);
            }
        }

        // 4. Exibir os resultados
        System.out.println("\n📊 Frequência de letras:");
        frequencia.forEach((ch, qtde) ->
                System.out.println(ch + ": " + qtde));

        sc.close();
    }
}
