package Hometask1;

import java.util.Arrays;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        // Task 1

        // Using Scanner for Getting Input from System.out.println("Invalid input" );
        System.out.println("Enter one number of array length" );
        Scanner in = new Scanner(System.in);
        String inputLength = in.nextLine();
        int lengthNumber = 0;

        try{
             lengthNumber = Integer.parseInt(inputLength);
            System.out.println("You entered: " + inputLength ); //
        }
        catch (NumberFormatException ex){
            System.out.println("Invalid input" );
        }



        int [] array = new int[]{};
        System.out.println("Enter numbers with space" );
        String inputNumbers = in.nextLine();

        try{
            String[] stringsArray = inputNumbers.split(" ");
            array = Arrays.stream(stringsArray)
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
        catch (NumberFormatException ex){
            System.out.println("Invalid input" );
        }
    if (lengthNumber != array.length){
    System.out.println("Unexpected number of symbols" );
    System.out.println("false" );
}
    else{
     boolean isOk = isSorted(array);
        System.out.println(isOk);
}






    //Method for sorting arrays
   static boolean isSorted (int[] numberslist) {

        for (int i = 0; i < numberslist.length - 1; i++) {
            if (numberslist[i] > numberslist[i + 1])
                return false;
        }
        return true;
    }



    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

      static class MakingChanges {
        public static void changeIdentities(Person p1, Person p2) {
            String name = p1.name;
            int age = p1.age;
            p1.name = p2.name;
            p1.age = p2.age;

            p2.name = name;
            p2.age = age;
            System.out.print("Person1 : " + p1.name + " Age: " + p1.age);
            System.out.print("Person2 : " + p2.name + " Age: " + p2.age);

        }
    }

    public static void main(String[] args) {
        var p1 = new Person("name1", 1);
        var p2 = new Person("name2", 2);
        MakingChanges.changeIdentities(p1, p2);
    }
}
