package memento.task1;

public class LedTV {

  private String size;
  private String price;
  private boolean usbSupport;

  public LedTV(String size, String price, boolean usbSupport) {
    this.size = size;
    this.price = price;
    this.usbSupport = usbSupport;
  }

  @Override
  public String toString() {
    return "LedTV{" +
            "size='" + size + '\'' +
            ", price='" + price + '\'' +
            ", usbSupport=" + usbSupport +
            '}';
  }
}
