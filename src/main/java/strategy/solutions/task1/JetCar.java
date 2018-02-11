package strategy.solutions.task1;

public class JetCar extends Vehicle {

  public JetCar() {

    setMove(new Fly());
  }
}
