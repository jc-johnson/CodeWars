package src.main.java.JavaEight;

/**
 * Created by Jordan on 6/14/2017.
 */
public class LambdaTester2 {

    final static String salutation = "Hello! ";

    interface GreetingService {
        void sayMessage(String message);
    }

    public static void main(String[] args) {
        GreetingService greetingService = message -> System.out.println(salutation + message);
        greetingService.sayMessage("Mahesh");
    }
}
