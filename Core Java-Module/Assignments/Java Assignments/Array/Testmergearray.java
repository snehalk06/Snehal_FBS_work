public class Testmergearray {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5};
        int [] arr2={6,7,8,9};
        int s1=arr1.length;
        int s2=arr2.length;
        int s3=s1+s2;

        int []arr3=new int [s3];

        for(int i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];

        }

        for(int i=0;i<arr2.length;i++)
        {
            arr3[s1+i]=arr2[i];
        }

        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }

    }
    
}
