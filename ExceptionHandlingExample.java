
public class ExceptionHandlingExample {
 public static void main(String[] args) {
     try {
         // Simulating a runtime exception
         int result = 10 / 0;
     } catch (RuntimeException e) {
         // Converting the runtime exception to custom exception
         try {
             throw new CustomException("Custom Exception: " + e.getMessage());
         } catch (CustomException ce) {
             System.out.println(ce.getMessage());
         }
     }
 }
}
