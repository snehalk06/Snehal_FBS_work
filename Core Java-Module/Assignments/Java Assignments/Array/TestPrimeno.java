public class TestPrimeno {
    public static void main(String[] args) {
        int []arr={1,2,3,4,56,7,8,98};
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=1){
                continue;
            }

            int isprime=0;
            

            for(int j=2;j<=arr[i]/2;j++)
            {
                if(arr[i]%j==0)
                {
                    isprime=1;
                    break;
                    
                }
            }
             if(isprime==0)
        {
            System.out.println(arr[i]);
        }

        }
       
        
    }
    
}
