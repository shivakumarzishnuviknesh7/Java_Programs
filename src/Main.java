import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ReverseString
        String originalString = "example";
        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("Reversed String: " + reversedString);

        System.out.println("###################################################################################################################");
        //Swap two numbers with and without using a third variable in Java
        int a = 5, b = 10;

        // Using a third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Using third variable: a = " + a + ", b = " + b);

        // Without using a third variable
        a = 5; // Resetting values
        b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Without using third variable: a = " + a + ", b = " + b);

        System.out.println("###################################################################################################################");

        //Java program to check if a vowel is present in a string:
        String input = "example";
        boolean hasVowel = input.toLowerCase().matches(".*[aeiou].*");
        System.out.println("Contains vowel: " + hasVowel);

        System.out.println("###################################################################################################################");
        //Java program to check if the given number is a prime number:
        int number = 29;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Is prime: " + isPrime);

        System.out.println("###################################################################################################################");

        //Check whether a string is a palindrome in Java:
        String input5 = "madam";
        String reversed = new StringBuilder(input5).reverse().toString();
        boolean isPalindrome = input5.equals(reversed);
        System.out.println("Is palindrome: " + isPalindrome);

        System.out.println("###################################################################################################################");

        //Sort an array in Java in descending & ascending:
        Integer[] array = {3, 1, 4, 1, 5, 9};

        Arrays.sort(array); // Ascending
        System.out.println("Ascending: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder()); // Descending
        System.out.println("Descending: " + Arrays.toString(array));

        System.out.println("###################################################################################################################");
        //Find the factorial of an integer in Java:
        int number1 = 5;
        long factorial = 1;
        for (int i = 1; i <= number1; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);

        System.out.println("###################################################################################################################");
        //Remove all duplicates in the given String:

        String input1 = "example";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : input1.toCharArray()) {
            set.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        System.out.println("Without duplicates: " + result.toString());

        System.out.println("###################################################################################################################");
        //Reverse the Number:

        int number2 = 12345;
        int reversed1 = 0;
        while (number2 != 0) {
            int digit = number % 10;
            reversed1 = reversed1 * 10 + digit;
            number2 /= 10;
        }
        System.out.println("Reversed Number: " + reversed1);

        System.out.println("###################################################################################################################");
        //Count number of digits:
        int number3 = 12345;
        int count = 0;
        while (number3 != 0) {
            number3 /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);

        System.out.println("###################################################################################################################");
        //Check Armstrong number:
        int number5 = 153;
        int original = number5;
        int sum = 0;
        while (number5 != 0) {
            int digit = number5 % 10;
            sum += Math.pow(digit, 3);
            number5 /= 10;
        }
        boolean isArmstrong = (original == sum);
        System.out.println("Is Armstrong: " + isArmstrong);

        System.out.println("###################################################################################################################");
        //Count of each character in the String:

        String input3 = "example";
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : input3.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character count: " + countMap);


        System.out.println("###################################################################################################################");
        //Reverse each word in the given String:
        String input6 = "example string";
        String[] words = input6.split(" ");
        StringBuilder result2 = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        System.out.println("Reversed words: " + result2.toString().trim());

        System.out.println("###################################################################################################################");
        //Star pattern problem - left, right & pyramid:

        int n = 5;

        // Left-aligned triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Right-aligned triangle
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("###################################################################################################################");
        //Reverse the Array
        int[] array2 = {1, 2, 3, 4, 5};
        for (int i = 0, j = array2.length - 1; i < j; i++, j--) {
            int temp1 = array2[i];
            array2[i] = array2[j];
            array2[j] = temp1;
        }
        System.out.println("Reversed array: " + Arrays.toString(array2));


        System.out.println("###################################################################################################################");

        //Sum of digits:

        int number7 = 12345;
        int sum7 = 0;
        while (number7 != 0) {
            sum7 += number7 % 10;
            number7 /= 10;
        }
        System.out.println("Sum of digits: " + sum7);

        System.out.println("###################################################################################################################");
        //First occurrence in a string:

        String input7 = "example";
        char searchChar = 'a';
        int index = input7.indexOf(searchChar);
        System.out.println("First occurrence of '" + searchChar + "': " + index);
    }

    }



