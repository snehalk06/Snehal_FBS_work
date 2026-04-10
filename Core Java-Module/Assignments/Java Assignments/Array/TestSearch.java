public class TestSearch {
    public static void main(String[] args) {
        int[] arr={12,54,98,32,23};
        int isfound=0;
        int ele=30;
        for(int i=0;i<arr.length;i++)
        {
            if(ele==arr[i])
            isfound=1;

        }
        if(isfound==0)
        {
            System.out.println("Ele is not found");
        }
        else{
            System.out.println("Found");
        }
        }
    
}
