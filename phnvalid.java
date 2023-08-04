class invalidphn extends Exception
{
    invalidphn(String s)
    {
        super(s);
    }
}
public class phnvalid {

    static void validate(String s)throws invalidphn
    {
        if(s.length()!=10)
        throw new invalidphn("not valid");
        else
        System.out.println("Calling ... " + s);
    }
    public static void main(String args[])
    {
        try{
            validate("9433933772");
        }catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
        System.out.println("email.main()");
    }
    
}
