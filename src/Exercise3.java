import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Map<String, Double> produtos = new HashMap<>();
        produtos.put("Tapioca 1KG Hidratada", 15.99);
        produtos.put("Batata-frita 1KG Congelada", 20.99);
        produtos.put("Café 3 Corações", 10.99);
        produtos.put("2UN H20", 13.99);
        produtos.put("Bombom Lindor", 34.99);
        produtos.put("5KG de Alcatra", 105.99);

        Optional<Map.Entry<String, Double>> produtoBarato = produtos
                .entrySet()
                .stream()
                .min(Comparator.comparing(Map.Entry::getValue));
        Optional<Map.Entry<String, Double>> produtoCaro = produtos
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));

        OptionalDouble mediaPreco = produtos.values().stream().mapToDouble(Double::doubleValue).average();

        // Exibição dos resultados
        produtoBarato.ifPresent(p ->
                System.out.println("Produto mais barato: " + p.getKey() + " - R$" + p.getValue()));

        produtoCaro.ifPresent(p ->
                System.out.println("Produto mais caro: " + p.getKey() + " - R$" + p.getValue()));

        if (mediaPreco.isPresent()) {
            System.out.println("Média dos preços: R$" + String.format("%.2f", mediaPreco.getAsDouble()));
        }
    }
}
