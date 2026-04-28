import java.util.*;
public class InnerFindChar {
    public static void main(String[] args) {
        char ch;
        String str="Snehal";
        int found=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter char to find");
        ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch){
                found=1;
                break;
            }

        }
        if(found==1){
            System.out.println("found");
        }
        else
        {
            System.out.println("not foundqqq");
        }


        
    }

    
}