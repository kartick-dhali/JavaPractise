public class JavaStringbuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello world");
        // String st = "hello wolrd";
        // System.out.println("\n" + st.charAt(0));
        // String s3=st.concat("katu");
        // System.out.println(s3);

        str.append(" katu");
        System.out.println(str);

        StringBuilder str1=new StringBuilder("hello");
        str1.append(" panchu");
        System.out.println(str1);
    }
}
