public class TestEvenodd {
    public static void main(String[] args) {
        int[]arr={11,69,9,56,34};

        for(int i= 0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("Even no"+arr[i]);
            }
            else{
                System.out.println("Odd no."+arr[i]);
            }
        }

    }
    
}
