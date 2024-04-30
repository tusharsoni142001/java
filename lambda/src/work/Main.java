package work;

public class Main {

    public static void main(String[] args) {
        
        MyInter i=()-> System.out.println("First lambda function implementation");

        i.sayHello();

        sumInter sumInter=(a,b)-> a+b;

        System.out.println(sumInter.sum(10,20));

        lengthInter len=str->str.length();
        System.out.println(len.getLength("Tushar"));
    }
}