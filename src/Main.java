import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // MINI PROJECT

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess my number(1-100): ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println(" WOOHOO .. CORRECT NUMBER!! ");
                break;
            }
            else if (userNumber > myNumber){
                System.out.println(" YOUR NUMBER IS LARGE ");
            }
            else {
                System.out.println(" YOUR NUMBER IS SMALL ");
            }
        } while (userNumber >= 0);

        System.out.println(" MY NUMBER WAS : ");
        System.out.println(myNumber);


    }
}