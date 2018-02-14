package mediator.task1;

public class ChatClient {

  public static void main(String[] args) {

    ChatMediator chatMediator = new ChatMediatorImpl();
    User john = new UserImpl(chatMediator, "John");
    User brian = new UserImpl(chatMediator, "Brian");
    User james = new UserImpl(chatMediator, "James");
    User tony = new UserImpl(chatMediator, "Tony");

    chatMediator.addUser(john);
    chatMediator.addUser(brian);
    chatMediator.addUser(james);
    chatMediator.addUser(tony);

    brian.send("Hi everyone , let's start talking !");

  }

}
