package lab7;

public class ass2 {
    public static void main(String[] args) {
        try {
            String a = null;
            System.out.println(a.length());
        } catch (NullPointerException e) {
            System.out.println("cant operate on null.");
        } finally {
            System.out.println("code ended.");
        }
    }
}
