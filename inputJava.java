import java.util.Scanner;

public class inputJava {
    public static void main(String[] args) {
        Scanner s  = new Scanner (System.in);
        // System.out.println("Enter Your name:");
        // String name = s.nextLine(); //nextlIne is reading your string
        // // System.out.println(name);
        // System.out.println("Enter your age");
        // int age = s.nextInt();
        // if(age >= 18){
        //     System.out.println("You are able to vote");
        // }else{
        //     System.out.println("You are not able to vote");
        // }
        // s.nextLine(); //blank next line is use for 
        // System.out.println("Enter Your hobbies");
        // String hobby = s.nextLine();
        // System.out.println("Enter Your contact us:");
        // long number = s.nextInt();

        // System.out.println("Enter Fruit name:");
        // String abc= s.nextLine().toLowerCase();
        // if(abc.equals("apple")){
        //     System.out.println("You are able to vote");
        // }
        int score = 0;
        System.out.println("Enter Capital Of India:");
        String abc= s.nextLine().toLowerCase();
        if(abc.equals("delhi")){
            score++;
            System.out.println("Success");
        }else{
            System.out.println("Wrong");
            score--;
        }
        System.out.println("Enter National animal:");
        String animal= s.nextLine().toLowerCase();
        if(animal.equals("tiger")){
            score++;
            System.out.println("Success");
        }else{
            System.out.println("Wrong");
            score--;
        }
    }

}
