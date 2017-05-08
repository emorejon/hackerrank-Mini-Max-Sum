import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        /*used long for potential big numbers.
        And used an array to store the numbers.*/
        long[] array = {a,b,c,d,e};
        
        /*Ordered the array to make it easier.
        The example on the problem suggested adding all numbers with each
        other - 1, and then selecting both the max and min values. I chose to 
        simply order the numbers and sum the first 4 for the min value and 
        the last 4 for the max value. I USED BUBBLE SORT BECAUSE THE PROBLEM 
        SPECIFIED ONLY 5 VALUES. IT DIDN'T SEEM NECESSARY TO GO INTO MORE COMPLEX
        SORTING ALGORITHMS FOR FASTER TIMES.*/
        for(int i  = 0; i < 5; i++){
            for(int j = i; j < 5;j++){
                if(array[i] > array[j]){
                    long temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        //adding last 4 numbers to get max value.
        long sumMax = 0;
        for(int i = 1; i < 5; i++){
            sumMax += array[i];
        }
        //adding first 4 numbers to get min value.
        long sumMin = 0;
        for(int i = 0; i < 4; i++){
            sumMin += array[i];
        }
        
        //printing min and max values.
        System.out.println(sumMin + " " + sumMax);
        
    }
}
