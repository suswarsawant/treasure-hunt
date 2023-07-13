import java.util.Scanner;
public class TreasureIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Treasure Island.\n You mission is to find the treasure.");
        System.out.println("Which way you want to go? Left Or Right");
        String leftRight = sc.nextLine();
        if(leftRight.equalsIgnoreCase("right")){
            System.out.println("Fall into a hole. Game Over!");
        }else if(leftRight.equalsIgnoreCase("left")){
            System.out.println("Swim or Wait?");
            String swimWait = sc.nextLine();
            if(swimWait.equalsIgnoreCase("swim")){
                System.out.println("Attacket by trout. Game over!");
            }else if(swimWait.equalsIgnoreCase("wait")){
                System.out.println("Which door will you chose? Red Blue Yellow");
                String whichDoor = sc.nextLine();
                if(whichDoor.equalsIgnoreCase("red")){
                    System.out.println("Burned by fire. Game Over");
                }else if(whichDoor.equalsIgnoreCase("blue")){
                    System.out.println("Eaten by beasts. Game Over!");
                }else if(whichDoor.equalsIgnoreCase("yellow")){
                    System.out.println("You Won!");
                }else{
                    System.out.println("Game Over!");
                }
            }

        }else{
            System.out.println("Fall into a hole. Game Over.");
        }     
    }
}
