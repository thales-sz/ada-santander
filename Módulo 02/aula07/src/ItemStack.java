import java.util.ArrayList;
import java.util.EmptyStackException;

public class ItemStack extends Stack {
  protected ArrayList<Object> stack;

  public ItemStack() {
    this.stack = new ArrayList<Object>();
  }

  @Override
  public void push(Object obj) {
    this.stack.add(obj);
  }

  @Override
  public Object pop() {
    if (this.stack.isEmpty()) {
      throw new EmptyStackException();
    }
    return this.stack.remove(this.stack.size() - 1);
  }

  @Override
  public Object peek() {
    if (this.stack.isEmpty()) {
      throw new EmptyStackException();
    }
    return this.stack.get(this.stack.size() - 1);
  }
}
