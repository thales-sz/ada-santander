package utils;

public class CannotBuyZeroException extends RuntimeException {
  public CannotBuyZeroException(String msg) {
    super(msg);
  }
}
