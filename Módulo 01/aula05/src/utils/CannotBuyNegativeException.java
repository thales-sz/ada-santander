package utils;

public class CannotBuyNegativeException extends RuntimeException {
  public CannotBuyNegativeException(String msg) {
    super(msg);
  }
}
