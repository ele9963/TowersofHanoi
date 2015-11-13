
package towersofhanoi;

import java.util.Scanner;

public class TowersOfHanoi {

   
   public static void main(String[] args) {
       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
       System.out.print("You have 3 pegs. They are labeled 1, 2, and 3 from left to right. "
               + "Only peg 1 is currently holding discs. \nPlease enter the number of discs on peg 1. ");
       Scanner Input = new Scanner(System.in);
       int discs = Input.nextInt();
       towersOfHanoi.solve(discs, "peg 1", "peg 2", "peg 3");

   }
   public void solve(int n, String left, String middle, String right) {
       if (n == 1) {
           System.out.println("Topmost disc on "+left + ", move to " + right);
       } else {
           solve(n - 1, left, right, middle);
           System.out.println("Topmost disc on "+left + ", move to " + right);
           solve(n - 1, middle, left, right);
       }
   }

}
