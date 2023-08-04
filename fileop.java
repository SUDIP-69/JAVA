import java.io.FileOutputStream;

public class fileop {

public static void main(String args[]){

try{

FileOutputStream fout=new FileOutputStream("./out1.txt");

fout.write(5);
fout.close();

fout =new FileOutputStream("./out2.txt");

fout.write(6);
fout.close();

System.out.println("success...");

}catch(Exception e){System.out.println(e);}

}}