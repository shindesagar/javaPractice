import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your choice (1-10): ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("1. Pyramid");
                printPyramid();
                break;
            }
            case 2:{
                System.out.println("2. Dimond");
                printDimond();
                break;
            }
            case 3:{
                System.out.println("3.  Number Pattern");
                // printPattern();
                break;
            }
            case 4:{
                System.out.println("4. Floyd's Tringe");
                floydsTrianglePattern();
                break;
            }
            case 5:{
                System.out.println("5. Hollow Rectangle");
                printHollowRectangle();
                break;
            }
            case 6:{
                System.out.println("6. Half Pyramid");
                printHalfPyramid();
                break;
            }
            case 7:{
                System.out.println("6. Half Inverted Pyramid");
                printHalfInvertedPyramid();
                break;
            }
            case 8:{
                System.out.println("7.  Inverted Half Pyramid");
                printInvertedHalfPyramid();
                break;
            }
            default:{
                System.out.println("Invalid Choice");
            }
            
        }
    }
    public static void printPyramid() {
        int number = 4;
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                System.out.print("*");    
            }
            System.out.println();
        }  
    }
    public static void floydsTrianglePattern() {
        //floyd's triangle
        int num = 10;
        int floyd = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(floyd++ + " ");
            }
            System.out.println(" ");
        }
        
    }
    public static void printDimond() {
        int number = 7;
         for(int row = 0; row < number; row++){
            for(int c1 = 0; c1 < number - row - 1; c1++){
                System.out.print(" ");
            }
            for(int c2 = 0; c2 < row * 2 + 1; c2++){
                System.out.print("*");
            } 
            System.out.println();
        }
        for(int row = number - 2 ; row >= 0; row--){
            for(int c1 = 0; c1 < number - row - 1; c1++){
                System.out.print(" ");
            }
            for(int c2 = 0; c2 < row * 2 + 1; c2++){
                System.out.print("*");
            } 
            System.out.println();
        }
        
    }
    // public static void printPattern() {
            
    // }
    // public static void printFloyd() {
            
    // }
    public static void printHollowRectangle(){
        int n = 4; 
        int m = 3;
        // Outer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop
            for (int j = 1; j <= m; j++) {
                // cell --> (i,j)
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printHalfPyramid() {
        int row = 4;
        // Outer loop
        for (int i = 1; i <= row; i++) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= row; i++) {
            // Inner Loop
            for (int j = i; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printHalfInvertedPyramid() {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            // Inner Loop
            for (int j = i; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Print number
        for (int i = 1; i <= row; i++) {
            // Inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= row; i++) {
            // Inner Loop
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void printInvertedHalfPyramid() {
        int number = 4;
        for (int row = 1; row <= number; row++) {
            // Inner Loop For Space
            for (int col = 1; col <= number - row; col++) {
                System.out.print(" "); 
            }
            // Inner Loop to print star
            for (int col = 1; col <= row; col++) {

                System.out.print("*");  
            }
            System.out.println();
        }
        
    }
    
}
