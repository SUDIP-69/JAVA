public class complex {
    
    int r,i;
    complex()
    {
        r=2;
        i=3;
    }
    void add(complex c2)
    {
        this.r += c2.r;
        this.i += c2.i;
    }
     void display()
     {
        System.out.println("Number: "+ r + " + i"+ i);
     }

    public static void main(String args[])
    {
        complex o1 = new complex();
        complex o2 = new complex();
        o1.add(o2);
        o1.display();
    }
}