class prime
{
    public static void main(int x)
    {
        int c=0;
        for(int i=1;i<x/2;x++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==2)
            System.out.println("prime");
        else
            System.out.println("Not prime");

    }
}
