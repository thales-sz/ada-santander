public abstract class AbstractList {
  private Object[] array;

  public abstract void add(Object o);

  public abstract Object get(int index);

  public abstract int size();

  public abstract void remove(int index);
}
