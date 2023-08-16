public class Aula07Exercicio {
  public static void main(String[] args) {
    ItemStack itemStack = new ItemStack(2);

    itemStack.push("Item 1");
    itemStack.push(5); 
    
    System.out.println(itemStack.pop());
    System.out.println(itemStack.pop());
  }
}
