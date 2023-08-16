public class AbstractArrayList extends AbstractList {
  private Object[] array;
  private int size;

  public AbstractArrayList() {
    this.array = new Object[10];
  }

  @Override
  public void add(Object obj) {
    this.array[this.size] = obj;
    this.size++;
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

  @Override
  public void remove(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }

    for (int i = index; i < this.size - 1; i++) {
      this.array[i] = this.array[i + 1];
    }

    this.array[this.size - 1] = null;

    this.size--;
  }
}
