public class duplicate {
     public static void main(String args[])
     {
        int ar[]={1,2,3,1,2};
    
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                {
                    ar[i]=0;
                }
            }
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]+" ");
        }
     }
}
