import java.util.TreeSet;
class HashSetExample 
{
    public static void main(String args[])
    {
       TreeSet<Integer> hs=new TreeSet<>();
       hs.add(10);
       hs.add(20);
       hs.add(30);
       hs.add(40);
       hs.add(50);
       for(Integer i:hs)
       {
         System.out.println(i);
       }
       System.out.println(hs);
    }
}
/* Linked is for insertion order
   Tree is for sorted order
   Hash is for fast access 
*/