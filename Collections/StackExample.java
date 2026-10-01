import java.util.Stack;
Class StackExample{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.push(10);
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
    }
}