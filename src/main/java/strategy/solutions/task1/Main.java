package strategy.solutions.task1;

public class Main {

  public static void main(String[] args) {

    Vehicle porsche = new Porsche();
    Vehicle vintageCar = new VintageCar();
    Vehicle jetCar = new JetCar();

    System.out.println("Porsche : " + porsche.tryToMove());
    System.out.println("Vintage car :" + vintageCar.tryToMove());
    System.out.println("Jetcar : " + jetCar.tryToMove());

    vintageCar.changeMotionType(new DriveFast());
    System.out.println("Vintage car after 'pimp my ride' : " + vintageCar.tryToMove());

  }


}
