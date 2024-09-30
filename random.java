//Question:
//Write a Java program that generates random numbers between 0 and 10 using the Random class.
 ///The program should continuously generate and print random numbers until it generates the number 5, at which point it should stop.

import java.util.Random;
class random{
    public static void main(String arg[]){
        Random rand= new Random();
        int num=0;
    while(num!=5){
        num=rand.nextInt(11);
        System.out.println(num);
    }
    }
}