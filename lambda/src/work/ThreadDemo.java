package work;

public class ThreadDemo {

    public static void main(String[] args) {
        //First thread - JoHN

    Runnable t1=()->{
        //this is the body of thread

        for(int i=0;i<=10;i++)
        {
            System.out.println("Value of i : "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Thread t1Thread=new Thread(t1);
    t1Thread.setName("JOHN");
    t1Thread.start();

    Runnable t2=()->{
        for(int i =1;i<=10; i++)
        {
            System.out.println(i+2);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    };

    Thread t2Thread=new Thread(t2);
    t2Thread.start();
    }
}
