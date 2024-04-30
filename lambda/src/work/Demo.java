package work;

@FunctionalInterface
interface A{
   void show(int i);
}
public class Demo {
    public static void main(String[] args) {
        // int a=10;
        A obj = a->System.out.println("Hello "+a); 
        obj.show(10);
    }
}
