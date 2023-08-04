import java.io.*;
public class buff {
    public static void main(Integer args[])throws IOException
    {
        System.out.println("Enter a number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x=br.read();
        System.out.println(x);

    }
}
