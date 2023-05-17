import java.util.Scanner;

/**
  @author Zohaib Khan 3740572
**/
public class InputAndOutput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("My name is TOM. What is your name?");
    String userInputName = sc.nextLine();
    System.out.println("Pleased to meet you, " + userInputName);
    System.out.println("In which program are you enrolled?");
    String userInputProgram = sc.nextLine();
    System.out.println(userInputName + " in " + userInputProgram + "? I think I saw you today.");
  }
}
