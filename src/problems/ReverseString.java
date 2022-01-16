package problems;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Java is oop languahe";
        String  rev = " ";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
