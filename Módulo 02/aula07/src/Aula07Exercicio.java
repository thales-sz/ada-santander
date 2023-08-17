public class Aula07Exercicio {
  public static void main(String[] args) {
    ItemStack itemStack = new ItemStack();

    itemStack.push("Item 1");
    itemStack.push(5); 
    
    System.out.println(itemStack.pop());
    System.out.println(itemStack.pop());

    itemStack.push("Item 2");
    itemStack.push("Item 3");

    System.out.println(itemStack.peek());
    System.out.println(itemStack.stack.size());
  }
}
