import java.io.*;
import java.util.*;
public class fileio {
    public static void main(String args[])
    {
        int i;
        try{
        FileOutputStream fout = new FileOutputStream("./out1.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        byte b[]=s.getBytes();
        fout.write(b);
        fout.close();
        }
        catch(Exception e){System.out.println("Exception caught."+e);}

        try{
            FileInputStream fin =  new FileInputStream("./out1.txt");
            FileOutputStream fout = new FileOutputStream("./out2.txt");  
            while((i=fin.read())!=-1) 
            {   
             System.out.println((char)i);
             fout.write(i);
            }
        fin.close();
        fout.close();    
        }
        catch(Exception e){System.out.println(e);}

        try
        {
            FileInputStream fin = new FileInputStream("./out2.txt");
            while((i=fin.read())!=-1) 
             System.out.print((char)i);
            fin.close();
        }
        catch(Exception e){System.out.println(e);}
    }    
}
