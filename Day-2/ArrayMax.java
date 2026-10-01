public class ArrayMax {
     public static void main(String args[]){
       int[] a={10,20,30,40,50};
       int max=Integer.MIN_VALUE;
       for(int i=0;i<a.length;i++){
           if(max<a[i]){
            max=a[i];
           }
        }
        System.out.print(max);
      }
}
