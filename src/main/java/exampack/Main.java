package exampack;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //QUestion 1
public static void onlyOddFrom10(){
    int ten = 10;
    while (ten > 0){
        if(ten % 2 != 0) {
        System.out.println(ten);
        }
        ten--;
    }
}

//Question 2
public static int returnSum(int[] intArray){
    int sum = 0;
    for (int i = 0; i < intArray.length; i++ ){
        sum += intArray[i];
    }
    return sum;
}

// Question 3
    public static double returnAverage(double[] doubleArray){
    double sum = 0;
    for (int i = 0; i < doubleArray.length; i++){
        sum += doubleArray[i];
    }
    return sum / doubleArray.length;
    }

//Question 4
    public static int randomOneToSix(){

    Random random = new Random(); //Creating a new "Random" object so that we can use the built-in random "class" methods on it.

    int randomNumber = random.nextInt(6) + 1; //We use the .nextInt() method on our object to generate a number between 0 and 5 (but add 1 to make the range be technically 1 and 6)
        //we then store it in an int variable named randomNumber

        return randomNumber;
    }

//Question 5
    public static int returnEvenSum(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                sum += intArray[i];
            }
        }
        return sum;
    }

// Question 6

    public static double volumeOfCube (double lengthOfSide){
    return (lengthOfSide * lengthOfSide * lengthOfSide);
    }

//Question 7

public static int characterCounter(String aString, char givenChar){
    int numberOfTimes = 0;
    for (char ch : aString.toCharArray()){
        if (ch == givenChar){
            numberOfTimes++;
        }
    }
    return numberOfTimes;
}

//Question 8

    public static boolean isPalindrome (String aString){
    char[] stringToCharArray = aString.toCharArray();
    for (int i = 0; i < stringToCharArray.length/2 ; i++){
        if (stringToCharArray[i] != stringToCharArray[(stringToCharArray.length - 1) - i]){
            return false;
        }
        }
    return true;
    }


    // Question 9

    public static boolean isLeapYear (int year){
    if (year % 4 == 0 && year % 100 != 0){
            return true;
        } else if (year % 400 == 0){
        return true;
    } else {
        return false;
    }
    }

    //Question 10


    public static void ticketAndDestinationInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your ticket number?");
        int ticketNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your destination?");
        String destination = scanner.nextLine();
        System.out.println("Now serving customer number " + ticketNumber + ". Please enjoy your trip to " + destination + ".");
    }






    public static void main(String[] args) {


    //Question 1
    onlyOddFrom10();

    //Question 2
    int[] ints = {1, 2, 3, 4, 5};
    System.out.println(returnSum(ints));

    //Question 3
        double[] doubles = {1, 2, 3, 4, 5};
        System.out.println(returnAverage(doubles));

    //Question 4
        System.out.println(randomOneToSix());


    //Question 5

    System.out.println(returnEvenSum(ints));


    //Question 6

    System.out.println(volumeOfCube(5.0d));

    //Question 7
        String str = "The quick brown fox jumped over the lazy dog";
        System.out.println(characterCounter(str, 'e'));

    //Question 8

    String palindrome = "deified";
    System.out.println(isPalindrome(palindrome));

    //Question 9

        System.out.println(isLeapYear(2021));

        //Question 10

        ticketAndDestinationInput();

    }
}
