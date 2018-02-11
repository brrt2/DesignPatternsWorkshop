package strategy.solutions.task2;

public class Main {

  public static void main(String[] args) {

    MessageProcessor messageProcessor = new MessageProcessor();
    System.out.println(messageProcessor.processMessage(new HitResponse()));
    System.out.println(messageProcessor.processMessage(new MissResponse()));
    System.out.println(messageProcessor.processMessage(new SunkResponse()));

  }
}
