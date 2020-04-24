package Repetition2;

import java.util.*;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Exponent-->");
        int exponent=sc.nextInt();
        int base = 2;
        long result = 1;
        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
        }
    }




