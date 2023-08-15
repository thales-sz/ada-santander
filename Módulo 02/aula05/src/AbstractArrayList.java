public class AbstractArrayList extends AbstractList {
  private Object[] array;
  private int size;

  public AbstractArrayList() {
    this.array = new Object[10];
  }

  @Override
  public void add(Object obj) {
    this.array[this.size] = obj;
  }

  @Override
  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    return this.array[index];
  }

  @Override
  public int size() {
    return this.size;
  }
}
