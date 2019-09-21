
import java.util.*;
class fizzBuzz
{
    public static void main(String args[])
    {
        int val = 100;
        for (int i=1; i<=val; i++)
        {
            // System.out.println(i);
            if (i % 3 == 0){
                System.out.println("FizzBuzz");

            }else if (i % 5 == 0){
                System.out.println("Buzz");

            }else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");

            }else
                System.out.println(i);
        }
    }
}