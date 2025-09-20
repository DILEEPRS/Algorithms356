public class Namaste {

  public static void main(String[] args) {

    doNothing(); // Function invocation

  }

  // Function defination
  public static void doNothing() {
    PrintMessage("namaste dileepa");
  }

  static String PrintMessage(String message) {

    System.out.print(message);
    return message;

  }

}