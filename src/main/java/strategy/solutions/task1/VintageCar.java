package strategy.solutions.task1;

public class VintageCar extends Vehicle {

  public VintageCar() {

    setMove(new DriveSlowly());

  }
}
