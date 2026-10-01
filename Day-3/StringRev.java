public class StringRev {
    public static void main(String[] args)
    {
        String s="Hello how are you";
        String[] s1=s.split(" ");
        String s3="";
        for(int i=s1.length-1;i>=0;i--)
        {
            s3=s3+s1[i]+" ";
        }
        System.out.print(s3);
    }
}