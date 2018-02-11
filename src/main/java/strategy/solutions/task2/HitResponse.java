package strategy.solutions.task2;

public class HitResponse extends Response {

  public HitResponse() {
    setAction(new MarkHit());
  }
}
