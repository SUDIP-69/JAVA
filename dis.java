class phn
{
    void show()
    {
        System.out.println("phn");
    }
}
class sphn extends phn
{
    void show()
    {
        System.out.println("smart phn");
    }
}
class cphn extends phn
{
    void show()
    {
        System.out.println("cell phn");
    }
}
public class dis {
    public static void main(String args[])
    {
        phn p;
        sphn s=new sphn();
        cphn c=new cphn();
        p=s;
        p.show();
        p=c;
        p.show();
    }  
}
