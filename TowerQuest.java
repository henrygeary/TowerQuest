import java.io.*;
import java.awt.*;
import java.util.*;

public class TowerQuest {
   public static void main (String[] args) {
      Scanner console = new Scanner (System.in);
      boolean alive = true;
      intro();
      while (alive) {
         newFloor();
         //if (roomContent().equals("Monster")) {
           // System.out.println("you find a moonster");
         }
      }
   }
   
   public static void intro (){
      System.out.println("Welcome to the Tower!!!");
      System.out.println("Let's see if you can survive");
      System.out.println("if you make wise choices you will live");
      System.out.println("if not you will die");
      System.out.println("LET'S BEGIN!!!");
      System.out.println();
      System.out.println("You walk up to the tower and open the door");
   }
   
   public static void newFloor (){
      System.out.println("You walk up to the floor's door and open it");
   }
   
  /*& public static String roomContent();
      double number = Math.random();
      number = number * 100 + 1;
      if (number % 3 == 0) {
         return "Monster";
      } else if (number % 3 == 1) {
         return "Person";
      } else {
         return "Treasure";
      }
   }*/
}
