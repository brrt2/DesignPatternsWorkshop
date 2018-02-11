package strategy.solutions.task2;

public class MissResponse extends Response {

  public MissResponse() {

    setAction(new MarkMiss());
  }
}

