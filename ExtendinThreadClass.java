class MyThread extends Thread
{
    public void run()
    {
        System.out.println("this is child thread of Parents Thread class");
    }
}
public class ExtendinThreadClass {
    public static void main(String args[])
    {
        System.out.println("Parents thread");
         MyThread t=new MyThread();
         t.start();  //start method is used to register the thread to schedule
    }
    
}
