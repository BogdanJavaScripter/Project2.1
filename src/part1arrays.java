import java.awt.*;
import java.util.Scanner;
public class part1arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        String program;

        System.out.println("Hi am Bogdan, What is your name. ");
        name = keyboard.nextLine();
        System.out.println("I a new student of AUK am trying to make friends ");

        System.out.println("Pls can you write your program ");
        program = keyboard.nextLine();
        boolean BSE = program.contains("BSE");
        if (BSE) {
            System.out.println("Same, maybe we have more same that you can think  ");
        } else {
            System.out.println("Nice but i think BSE is better then BDS");
        }


        System.out.println("What is yor age");
        age = keyboard.nextInt();
        if (age >= 15) {
            System.out.println("nice your not to young ");
        } else {
            System.out.println("sorry you to small maybe your a junius to study here");
        }


        System.out.println("/");
        String thanks;
        keyboard.nextLine();

        System.out.println("If you like to program on java put a true if not false. ");
        String likeprogram;
        likeprogram = keyboard.nextLine();
        boolean liketoprogram;
        if (true) {
            System.out.println(" I see that the reason why you here");

        } else {
            System.out.println("I don't know what you are doing here ?");
        }

        System.out.println("/");
        System.out.println("Now you can see all information about you.");
        System.out.println("Your name is " + name);
        System.out.println("Your program " + program);
        System.out.println("Your age is " + age);
        System.out.println("Like to program " + likeprogram);
        System.out.println("/");
        System.out.println("And all information about me.");
        System.out.println("My name is Bogdan");
        System.out.println("My age is 15");
        System.out.println("My Program is BSE");
        System.out.println("Like to Program true");
        System.out.println("/");
        System.out.println("If you want to be my friend put true ");
        String end;
        boolean End = program.contains("true");
        end = keyboard.nextLine();
        if (true) {
            System.out.println("I knew, come to ethics, see you there.");
        } else {
            System.out.println("I understood you. good luck");
        }


    }
}