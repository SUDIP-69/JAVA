public class trail{

    static int prime(int x)
    {        
        for(int i=2;i<x;i++)
        {
        if(x%i == 0)
        return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        for(int i=0;i<args.length;i++)
        {
        if(prime(Integer.parseInt(args[i])) == 1)
        System.out.println(args[i]);
        } 
    }
}