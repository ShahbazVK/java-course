class Main {
  // static method can access only static variables
  static int age = 23;

  public static void main(String[] args) {
    int intNumber = 10;
    float floatNumber = intNumber;
    double doubleNumber = intNumber;
    String name = "Shahbaz";
    String sentence="The sky is blue and blue is my favourite color";

    String formattedString = String.format("Following are the numbers: int %d, float %f, double %f. My name is %s",
        intNumber, floatNumber, doubleNumber, name);
    System.out.println(formattedString);
    System.out.println(sentence.replace("blue","red"));
  }
}