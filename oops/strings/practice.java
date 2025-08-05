package strings;

public class practice {
    public static void main(String[] args) {
        String str1 = new String("aryan");
        String str2 = new String("kapoor");
        String str3 = new String("ARYAN");
        String str4 = new String("hello aryan kapoor this side this side");

        System.out.println(str1.substring(0, 2));

        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str4.indexOf("this"));
        System.out.println(str4.lastIndexOf("this"));

        String ct = str1.concat(str2);
        System.out.println(ct);

        String old = ct.replace("aryan", "sanj");
        System.out.println(old);

        String ct2 = ct.toUpperCase();
        System.out.println(ct2);

        String ct3 = ct2.toLowerCase();
        System.out.println(ct3);

        StringBuffer sbf = new StringBuffer("hello "); // string builder if sync is not needed, REPLACE extra
        sbf.append("world!");
        sbf.insert(12, "goodmorning!");
        sbf.delete(12, 17);
        System.out.println(sbf);

    }
}
