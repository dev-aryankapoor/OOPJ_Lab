package kunal_kushswaha.exception_handling;

public class exceptions {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            // int c = a / b;
            int c = divide(a, b);
            System.out.println("execute only when there is no error and result is: " + c);
        } catch (ArithmeticException e) { //
            System.out.println(e.getMessage());//
        } catch (Exception e) { //
            System.out.println("superclass exception");//
        } finally {
            System.out.println("this will always execute.");
        }

    }

    static int divide(int a, int b) throws ArithmeticException {//
        if (b == 0) {
            throw new ArithmeticException("please do not divide by zero");//
        }

        return a / b;
    }

}
