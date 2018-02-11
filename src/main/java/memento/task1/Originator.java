package memento.task1;

public class Originator {

  LedTV ledTV;

  public void setLedTV(LedTV ledTV) {
    this.ledTV = ledTV;
  }

  public Memento createSnapshotOfCurrentState(){
    return new Memento(ledTV);
  }

  public void restorePrevious (Memento memento) {
    ledTV = memento.getLedTV();
  }

  @Override
  public String toString() {
    return "Originator{" +
            "ledTV=" + ledTV +
            '}';
  }
}
