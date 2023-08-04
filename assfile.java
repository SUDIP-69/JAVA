import java.io.FileInputStream;

public class assfile {

public static void main(String args[]){

try{

FileInputStream fin1=new FileInputStream("./out1.txt");
FileInputStream fin2=new FileInputStream("./out2.txt");

int i=fin1.read();
int j=fin2.read();

System.out.print(i + " + " + j + " = " + (i+j));

fin1.close();
fin2.close();

}catch(Exception e){System.out.println(e);}

}  

}