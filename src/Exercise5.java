import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada do usuário
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        // 2. Remover pontuação básica e dividir em palavras
        String[] palavras = frase
                .replaceAll("[.,!?;]", "") // remove pontuação comum
                .split(" ");

        // 3. Contar o número total de palavras
        long totalPalavras = Arrays.stream(palavras)
                .filter(p -> !p.isBlank()) // ignora espaços duplos ou vazios
                .count();

        // 4. Filtrar palavras com mais de 4 letras
        List<String> palavrasMaiores = Arrays.stream(palavras)
                .filter(p -> p.length() > 4)
                .collect(Collectors.toList());

        // 5. Contar quantas vezes "Java" aparece (ignorando caixa)
        long quantidadeJava = Arrays.stream(palavras)
                .filter(p -> p.equalsIgnoreCase("Java"))
                .count();

        // 6. Exibir os resultados
        System.out.println("\n📊 Análise da frase:");
        System.out.println("Total de palavras: " + totalPalavras);
        System.out.println("Palavras com mais de 4 letras: " + palavrasMaiores);
        System.out.println("Quantidade de vezes que a palavra \"Java\" aparece: " + quantidadeJava);

        sc.close();
    }
}
