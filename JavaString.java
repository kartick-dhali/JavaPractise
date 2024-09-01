public  class JavaString{
    public static void main(String[] args) {
        //java string not mutable
        String s1="disha";
        String s2="disha";
        String s3=new String("disha");

        System.out.println(s1);
        System.out.println(s2==s1);
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
    
    }
}