package strategy.solutions.task1;

public class Porsche extends Vehicle {

  public Porsche() {

    setMove(new DriveFast());

  }
}
