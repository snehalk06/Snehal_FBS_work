import java.util.*;

public class RemoveChar {

    public static void main(String[] args) {
        String str = "Snehal";
        System.out.println("Enter Index to remove Char");
        int index;
        Scanner sc = new Scanner(System.in);
        index = sc.nextInt();

        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(index);

        System.out.println("Updated String: "+sb);

    }
}