package Task1;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.stream.IntStream;

/**
 *  В цьому класі описано виклик виключення
 *
 */
public class WrongInputConsoleParametersException extends Exception{
     String msg;

     public WrongInputConsoleParametersException(String msg) {
          super(msg);
          this.msg = msg;
     }

     public String getInput() {
          return msg;
     }

}
