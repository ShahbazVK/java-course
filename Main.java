import java.util.Scanner;

class Main {
  // // static method can access only static variables
  // static int age = 23;

  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // int intNumber = 10;
    // float floatNumber = intNumber;
    // double doubleNumber = intNumber;
    // String name = "Shahbaz";
    // String sentence = "The sky is blue and blue is my favourite color";

    // String formattedString = String.format("Following are the numbers: int %d,
    // float %f, double %f. My name is %s",
    // intNumber, floatNumber, doubleNumber, name);
    // System.out.println(formattedString);
    // System.out.println(sentence.replace("blue", "red"));
    // System.out.println(sentence.contains("sky"));

    // System.out.print("Enter your name: ");
    // String yourName = scanner.nextLine();
    // System.out.printf("My name is %s. What is your age? ", yourName);
    // int yourAge = scanner.nextInt();
    // scanner.nextLine();
    // System.out.printf("%d is an excellent age to start programming.", yourAge);
    // // scanner.nextDouble()
    // scanner.close();

    // ---------------------------------CALCULATOR---------------------------------

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    float number1 = scanner.nextFloat();
    System.out.print("Enter the second number: ");
    float number2 = scanner.nextFloat();

    scanner.nextLine();

    System.out.print("Enter operation: ");
    String op = scanner.nextLine();

    if (op.equals("sum")) {
      System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
    } else if (op.equals("sub")) {
      System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
    } else if (op.equals("mul")) {
      System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
    } else if (op.equals("div")) {
      System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
    }

  }
}