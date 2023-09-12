import java.util.Scanner;

public class part2_wrappers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Give me a value in hyrivna");
        int x = in.nextInt();
        in.nextLine();
        float hryvniaexchangerate = 36.65f;
        char amountuah = '$';

        System.out.println("Your value in dollar is " + (x / hryvniaexchangerate) + amountuah);

        {
            System.out.println("Write your value in dollar");
            int y = in.nextInt();
            in.nextLine();
            float dollarexchangevalue = 0.027f;
            char amount = '₴';
            System.out.println("Your value in hurivna " + ( y/ dollarexchangevalue) + amount);
        }

    }
}
