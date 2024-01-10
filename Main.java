import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

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

    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter the first number: ");
    // float number1 = scanner.nextFloat();
    // System.out.print("Enter the second number: ");
    // float number2 = scanner.nextFloat();

    // scanner.nextLine();

    // System.out.print("Enter operation: ");
    // String op = scanner.nextLine();

    // if (op.equals("sum")) {
    // System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
    // } else if (op.equals("sub")) {
    // System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
    // } else if (op.equals("mul")) {
    // System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
    // } else if (op.equals("div")) {
    // System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
    // }

    // -----------------------------VOWLES-----------------------------
    char vowels[] = { 'e', 'i', 'a', 'o', 'u' };
    // vowels[0]='a';
    // vowels[1]='e';
    // vowels[2]='i';
    // vowels[3]='o';
    // vowels[4]='u';

    // System.out.println(vowels.length);
    // Arrays.sort(vowels);
    // char key='i';
    // int foundItemIndex=Arrays.binarySearch(vowels,key);
    // System.out.println(Arrays.toString(vowels));
    // System.out.println(foundItemIndex);

    // int startingIndex=0;
    // int endingIndex=3;

    // Arrays.fill(vowels,startingIndex,endingIndex,'x');
    // System.out.println(Arrays.toString(vowels));

    // int numbers[]={1,2,3,4,5};
    // int copyOfNumbers1[]=numbers;
    // int copyOfNumbers2[]=Arrays.copyOf(numbers,numbers.length);
    // // int copyOfNumbers2[]=Arrays.copyOfRange(numbers,1,4);
    // Arrays.fill(numbers,0);

    // System.out.println(Arrays.toString(numbers));
    // System.out.println(Arrays.toString(copyOfNumbers1));
    // System.out.println(Arrays.toString(copyOfNumbers2));

    // // -----------------------------LOOPS-----------------------------
    // int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    // int sum = 0;
    // for (int number = 0; number < numbers.length; number++) {
    // sum += numbers[number];
    // }
    // System.out.println(sum);

    // // Table of any number
    // int tableOf = 5;
    // for (int number = 1; number <= 10; number++) {
    // System.out.printf("%d X %d = %d \n", tableOf, number, tableOf * number);
    // }

    // // -----------------------------ODD NUMBER / EVEN
    // NUMBER-----------------------------

    // System.out.println("Odd numbers:");
    // for (int number = 1; number <= 10; number++) {
    // if (number % 2 == 1) {
    // System.out.println(number);
    // }
    // }
    // System.out.println();
    // for (int odd : numbers) {
    // if (odd % 2 == 1) {
    // System.out.println(odd);
    // }
    // }

    // -----------------------------ARRAY-LIST-----------------------------

    // ArrayList<Integer> numbers = new ArrayList<Integer>();

    // numbers.add(4);
    // numbers.add(5);
    // numbers.add(3);
    // numbers.add(1);
    // numbers.add(2);

    // System.out.println(numbers.toString());
    // System.out.println(numbers.get(2));

    // numbers.remove(Integer.valueOf(4));
    // numbers.set(2, Integer.valueOf(30));

    // System.out.println(numbers.toString());

    // // numbers.clear();

    // numbers.sort(Comparator.naturalOrder());
    // System.out.println(numbers.toString());

    // -------------------------HASHMAP-----------------------------

    HashMap<String, Integer> examScores = new HashMap<String, Integer>();

    examScores.put("Math", 75);
    examScores.put("Sociology", 85);
    examScores.put("English", 95);
    examScores.put("Bengali", 85);
    examScores.put("Computer Programming", 96);

    examScores.putIfAbsent("Bengali", 30);
    examScores.replace("English", 20);

    System.out.println(examScores.toString());
    System.out.println(examScores.get("Bengali"));

    System.out.println(examScores.getOrDefault("Religion", -1));

    System.out.println(examScores.size());

    examScores.remove("Bengali");

    examScores.containsKey("Bengali");

    examScores.forEach((key,value)->{
      System.out.println(key + " - " + value);
    });

    examScores.clear();
    System.out.println(examScores.toString());
    
  }
}