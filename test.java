import java.util.Scanner;
public class test {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            System.out.println("Select a pattern to print:");
            System.out.println("1. Pyramid");
            System.out.println("2. Diamond");
            System.out.println("3. Number Pattern");
            System.out.println("4. Floyd's Triangle ");

            System.out.print("Enter your choice (1-4): ");
            int choice=sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Pyramid Pattern: ");
                    printPyramid();
                    break;
                }
                case 2:{
                    System.out.println("Diamond Pattern: ");
                    // printDiamond();
                    break;

            }
            case 3:{
                System.out.println("Number Pattern: ");
                printNumPat();
                break;
            
   }
            case 4:{
                System.out.println("Floyd's Triangle Pattern: ");
                // printFloyd();
                break;
            }
            default:{
                System.out.println("Invalid Choice");
            }
   }
   

        }
        public static void printPyramid(){
            int rows=7;
            for(int i=1;i<=rows;i++){
                for(int j=1;j<=(rows-i);j++){
                    System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
}}
public static void printNumPat(){
    int rows=7;
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
} }

