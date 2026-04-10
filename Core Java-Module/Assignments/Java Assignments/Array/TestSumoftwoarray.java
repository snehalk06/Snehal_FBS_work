public class TestSumoftwoarray {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int []arr2={10,20,30,40,50};
        
       

        int[] arr3=new int[arr1.length];


        for(int i=0;i<arr3.length;i++)
        {
            arr3[i]=arr1[i]+arr2[i];

        }
        for(int i:arr3)
        {
            System.out.println(i);
        }


    }
    
}
