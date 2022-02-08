package com.prepinsta;

import java.util.Scanner;

public class VarahamihiraAstrologyFindingDistance {

    public static void findingPosition(int cases) {

        int distance=10;
        char ch='R';
        int x=0,y=0;
        while(cases>0){
            switch (ch){
                case 'R':
                           x=x+distance; //dist=10 in right direction
                           ch='U';
                           distance=distance+10; //dist=20 in y direction
                           break;
                case 'U':
                          y=y+distance;  //0+20  in upward direction
                          ch='L';
                          distance=distance+10;//dist=30
                           break;
                case 'L':
                         x=x-distance;//10-30=-20 in left direction
                         ch='D';
                         distance=distance+10;//dist=40
                         break;
                case 'D':
                         y=y-distance;//20-40=-20
                         ch='R';
                            distance=distance+10;//dist=50
                            break;
                case 'A':
                        x=x+distance;
                        ch='R';
                        distance=distance+10;
                        break;

            }
            cases--;
        }
        System.out.println(x+ " " + y);//-20 -20 returned
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of cases");
        int cases=sc.nextInt();
        findingPosition(cases);
    }

}
/*

            He first turns and travels 10 units of distance
           His second turn is upward for 20 units
             Third turn is to the left for 30 units
           Fourth turn is the downward for 40 units
          Fifth turn is to the right(again) for 50 units
                       And thus he travels, every time increasing the travel distance by 10 units.
 */
