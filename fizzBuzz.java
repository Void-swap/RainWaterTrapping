//fizzbuzz is a coding problem where we have to print number from1-n 
// when we there is multiple of three print FIZZ
// when there is multiple of five print BUZZ
// when there is multiple of three as well as five print FIZZBUZZ

import java.util.*;

public class fizzBuzz {
    public static void main(String arg[]){
        System.out.print("ENter N :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){

            if((i%3==0) && (i%5==0)){
            System.out.println("fizzBuzz");
            continue;
            }
           
            else if(i%3==0){
              System.out.println("FIZZ");
            }
            else if(i%5==0){
                
                System.out.println("BUZZ");
               
            }

           
           
            if((i%3!=0) && (i%5!=0))
            System.out.println(i);
        
        }
        sc.close();

    }
    
}
