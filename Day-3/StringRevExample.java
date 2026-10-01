public class StringRevExample {
    public static void main(String[] args)
    {
        String s="Hello how are you";
        String[] s1=s.split(" ");
       int i=0;
        int j=s1.length-1;
        while(i<j)
        {
            String temp=s1[i];
            s1[i]=s1[j];
            s1[j]=temp;
            i++;
            j--;
        }
        String s2 = String.join(" ",s1);
        System.out.print(s2);
    }
}