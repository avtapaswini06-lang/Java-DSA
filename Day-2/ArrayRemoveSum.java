public class ArrayRemoveSum {
     public static void main(String args[]){
       int[] a={10,20,30,40,50};
       int sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
       for(int i=0;i<a.length;i++){
           sum=sum+a[i];
           if(max<a[i])
            {
             max=a[i];
            }
            if(min > a[i])
            {
             min=a[i];
            }
       }
       System.out.println("Sum:" + sum);
       System.out.println("Min Sum:" + (sum - min));
       System.out.println("Max Sum:" + (sum - max));
      }
}