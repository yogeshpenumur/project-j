public class tue {
    public static void main(String...args){
        int i;
        int  j;
        int k;
        int n=5;
        
        for(i=1;i<=n;i++)
        { 
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                if(i==1||i==n||j==1||j==i){
                    System.out.print(k +" ");

                }
                else
                {
                    System.out.print(" " +" ");
                }
                
            }
            System.out.println("");
        }
    }

}
