package mediator.task1;

abstract class User {

  private ChatMediator chatMediator;
  private String name;

  User(ChatMediator chatMediator, String name) {
    this.chatMediator = chatMediator;
    this.name = name;
  }

  abstract void send(String message);

  abstract void receive(String message);

  ChatMediator getChatMediator() {
    return chatMediator;
  }

  String getName() {
    return name;
  }

}
