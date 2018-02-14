package mediator.task1;

public class UserImpl extends User {


  UserImpl(ChatMediator chatMediator, String name) {
    super(chatMediator, name);
  }

  @Override
  public void send(String message) {

    System.out.println(this.getName() + " has sent : " + message + "\n");
    getChatMediator().sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println(this.getName() + " received : " + message);
  }
}
