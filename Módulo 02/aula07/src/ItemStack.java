public class ItemStack extends Stack {
  private int maxSize;
  private Object[] stackArray;
  private int size;

  public ItemStack(int maxSize) {
    this.maxSize = maxSize;
    this.stackArray = new Object[maxSize];
    this.size = -1;
  }

  @Override
  public void push(Object obj) {
    if (size < maxSize - 1) {
      stackArray[++size] = obj;
    } else {
      System.out.println("Pilha está cheia. Não é possível adicionar: " + obj);
    }
  }

  @Override
  public Object pop() {
    if (!isEmpty()) {
      return stackArray[size--];
    } else {
      throw new IllegalStateException("Pilha está vazia");
    }
  }

  @Override
  public Object peek() {
    if (!isEmpty()) {
      return stackArray[size];
    } else {
      throw new IllegalStateException("Pilha está vazia");
    }
  }

  @Override
  public boolean isEmpty() {
    return size == -1;
  }

  @Override
  public boolean isFull() {
    return size == maxSize - 1;
  }

  @Override
  public int size() {
    return size + 1;
  }
}
