
/**
 * Write a description of class C2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C2
{
    int age; //instance variable
    static int agr; //static variable
    public static void main(String[] args){
        int qty=10; //local variable
    System.out.println("it is our third workshop");
    
    //<class name> <variable>= new <class name>();
    
    C2 w1=new C2();
    
    System.out.println(w1.age);
    System.out.println(agr);
    System.out.println(qty);
    }
}