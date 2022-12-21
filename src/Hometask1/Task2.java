package Hometask1;
import java.util.Arrays;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Task2 {


        public static void main(String[] args) {


                //Task 2

                String input1 = "I'm going to go to school today morning";
                StringBuilder builder = new StringBuilder();
                builder.append(input1);
                builder.reverse();
                System.out.println(builder);

                String str = "I'm going to go to school today morning";
                // conversion from String object to StringBuffer
                StringBuffer sbr = new StringBuffer(str);
                // To reverse the string
                sbr.reverse();
                System.out.println(sbr);


                String input = "I'm going to go to school today morning";
                // convert String to character array
                // by using toCharArray
                char[] try1 = input.toCharArray();

                for (int i = try1.length - 1; i >= 0; i--)
                        System.out.print(try1[i]);


        }


}

