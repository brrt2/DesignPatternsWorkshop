package memento.task1;

public class Memento {

  private LedTV ledTV;

  public Memento(LedTV ledTV) {
    this.ledTV = ledTV;
  }

  public LedTV getLedTV() {
    return ledTV;
  }

  @Override
  public String toString() {
    return "Memento{" +
            "ledTV=" + ledTV +
            '}';
  }
}
