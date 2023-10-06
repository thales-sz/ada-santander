import java.util.Arrays;
import java.util.List;

public class Exercicio01Aula04 {
  List<Product> produtos = Arrays.asList(
      new Product("Notebook", 2500.0, 10),
      new Product("Impressora", 800.0, 5),
      new Product("Mouse", 50.0, 20),
      new Product("Teclado", 100.0, 15));

  public void moreThan500() {
    System.out.println("Produtos com preço maior que 500:");
    produtos.stream()
        .filter(p -> p.getPrice() > 500)
        .forEach(p -> System.out.println(p.getName()));
  }

  public void mapForPrice() {
    System.out.println("Preços dos produtos map:");
    produtos.stream()
        .map(Product::getPrice)
        .forEach(System.out::println);
  }

  public void cheapestProduct() {
    System.out.println("Produto mais barato:");
    Product cheapestProduct = produtos.stream()
        .min((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()))
        .get();
    System.out.println(cheapestProduct.getName());
  }

  public void lessThan10() {
    System.out.println("Produtos com quantidade menor que 10:");
    produtos.stream()
        .filter(p -> p.getQuantity() < 10)
        .forEach(p -> System.out.println(p.getName()));
  }


}
