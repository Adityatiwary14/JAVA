class outermain{    
    private int a=10;

    class inner1{
        void msg(){
            System.out.println("the data is "+ a);
        }

    }
}
public class innerclasseg {
    public static void main(String[] args) {
        outermain o1=new outermain();
        outermain.inner1 n1=o1.new inner1();
        n1.msg();
    }
}
