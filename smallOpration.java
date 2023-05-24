public class smallOpration {
    public static void main(String[] args) {
        // Counting the number of words into string
        String str1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        String[] str2 = str1.split(" ");
        System.out.println( str2.length);

        // Remove Space 
        String Str3 ="       ABC ";
        String Str4 = Str3.replace(" ", "");
        System.out.println(Str4.length());
        // reverse
        String str = "madam";
        StringBuilder reversed = new StringBuilder(str);
        System.out.println(reversed);
        reversed.reverse();
        
        String output = reversed.toString();
        System.out.println(output);

        //Paledrom
        String str5 = "madam";
        StringBuilder str6 = new StringBuilder(str5).reverse();
        String  ab = str6.toString();
         if(str5.equals(ab)){
            System.out.println("This is plindrome");
        }else{
            System.out.println("This is not plindrome"); 
        }

        // Count the numbers of owals in the string
         String str7 = "madam";

        // Duplicate charecter

    }
}
