package com.prepinsta;

import java.util.Scanner;

public class ValidInvalidString {

    public static void main(String[] args) {
        /*
                use case
                case 1: string is considered valid if the number of ‘*’ and ‘#’ are equal.
                case 2: otherwise invalid

                (*>#): positive integer
                (#>*): negative integer
                (#=*): 0
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
        char[] ch=str.toCharArray();
        int x=0,y=0;
        for (int i = 0; i < ch.length-1; i++) {

            if(ch[i]=='*' && ch[i+1]=='*' ){
                x++;
            }
            else if(ch[i]=='#' && ch[i+1]=='#'){
                y++;
            }
        }

        if (x==y){
            System.out.println("valid string "+0);
        }
        else if(x>y){
            System.out.println("Invalid string "+1);
        }
        else{
            System.out.println("Invalid string "+-1);
        }

    }
}
