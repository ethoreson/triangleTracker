import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to Triangle Tracker!");
    System.out.println("What is the length of the first side?");
    int userSideOne = Integer.parseInt(myConsole.readLine());

    System.out.println("What is the length of the second side?");
    int userSideTwo = Integer.parseInt(myConsole.readLine());

    System.out.println("What is the length of the third side?");
    int userSideThree = Integer.parseInt(myConsole.readLine());
    Triangle userTriangle = new Triangle(userSideOne, userSideTwo, userSideThree);

    String triangleOutput = userTriangle.whatType(userSideOne, userSideTwo, userSideThree);
    System.out.println("This is " + triangleOutput + " triangle.");
  }


}
