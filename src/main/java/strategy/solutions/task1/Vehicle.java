package strategy.solutions.task1;

public  abstract class Vehicle {

  private String name;
  private int maxSpeed;
  private Move move;

  String tryToMove() {
    return move.moveForward();
  }

  void changeMotionType(Move newMove) {
    move = newMove;
  }

  void setMove(Move move) {
    this.move = move;
  }
}
