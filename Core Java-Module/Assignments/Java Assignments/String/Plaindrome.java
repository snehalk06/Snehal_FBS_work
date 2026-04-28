public class Plaindrome {
    public static void main(String[] args) {
        String str="main";
        String reversed="";
        for (int i=str.length()-1;i>=0;i--) {
            reversed=reversed+str.charAt(i);  
        }
        if(str.equalsIgnoreCase(reversed))
        {
            System.out.println("Palindrome");
        }
        else
        System.out.println("not Palindrome");
    }
}
