class Animal{
    private void dog(){
        System.out.println("dogs always barks.");
    }
}
class Dog extends Animal{

}
public class exp_4_private {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.dog();
    }
}
