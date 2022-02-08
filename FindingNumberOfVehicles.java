package com.prepinsta;

import java.util.Scanner;

public class FindingNumberOfVehicles {

    public static void main(String[] args) {
        /*
             use case

             v- is the total number of vehicles given
             w- is the total number of wheels given
             from that we required to find out the total number of two
             and four wheelers
             at the end TW+FW=v this is required
             and also 4*fw+2*tw=w

         */

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total number of vehicles");
        int v=sc.nextInt();
        System.out.println("enter the total number of wheels");
        int w=sc.nextInt();
        float tw=(4*v-w)/2;

        if (w>=2 && w%2==0 && v<w){  //these are the constrains given
            System.out.println("number of two wheelers are "+(int)(tw)+
                    " number of four where are "+(int)(v-tw));
        }
        else{
            System.out.println("invalid input provided");
        }
    }
}
