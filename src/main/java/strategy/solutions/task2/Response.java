package strategy.solutions.task2;

public abstract class Response {

  private Action action;

  String performAction() {
    return action.act();
  }

  public void setAction(Action action) {
    this.action = action;
  }
}
