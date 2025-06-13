import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> nomes = List.of("João", "Maria", "Pedro", "Geovana", "Laura", "Mariana");
        List<String> resultado = nomes.stream()
                .filter(n -> n.length() > 5)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}