package Task2;

public class MyException extends Exception {
    String msg;

    public MyException(String msg) {
       super(msg);
        this.msg = msg;
    }

    public String getMesenger()
    {
        return msg;
    }
}
