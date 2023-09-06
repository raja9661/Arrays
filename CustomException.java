class Myexception extends Exception
{
    public Myexception()  //constructor which accept default value
    {}
    public Myexception(String msg) // constructor which accept string value
    {
        super(msg);
    }

}
public class CustomException {
    public static void main(String arga[])
    {
        int num1=6;
        int num2=-3;
        int res=0;
        try {
            if(num2<0)
            {
                //we can only throw object of Exception Because catch block receive only object of Exception class
               Exception e=new Myexception("cannot divide by negative number");
               //calling cath block by throwing exception by using throw keyword
               throw e;  
            }
            else
            {
                res=num1/num2;
                System.out.println(res);
            }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
    }
    
}
