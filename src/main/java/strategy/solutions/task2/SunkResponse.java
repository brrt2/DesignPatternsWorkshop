package strategy.solutions.task2;

public class SunkResponse extends Response {

  public SunkResponse() {
    setAction(new MarkSunk());
  }
}
