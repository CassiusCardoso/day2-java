import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> nomes = new HashSet<String>();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o nome " + i  +": ");
            String nome = sc.nextLine();
            nomes.add(nome);
            System.out.println("Nome adicionado com sucesso!" + nome);
        }
        boolean existe = nomes.stream()
                        .anyMatch(nome -> nome.equals("Cassius"));

        TreeSet<String> nomesOrdemAlfabetica = nomes.stream()
                        .sorted()
                                .collect(Collectors.toCollection(TreeSet::new));
        nomes.forEach(System.out::println);
        System.out.println("------------------");
        nomesOrdemAlfabetica.forEach(System.out::println);
        System.out.println("------------------");
        System.out.println("Cassius existe na lista? " + existe);
        sc.close();
    }
}
