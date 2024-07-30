public class Runner_Stack {
    
    public static void main(String[] args) {
        
        Stack nums = new Stack();
        nums.push(15);
        nums.push(27);
        nums.push(10);
        nums.push(11);
        nums.show();

        System.out.println("peek value:" + nums.peek());
       
        nums.push(8);
        nums.show();
    
        System.out.println("poping element:" + nums.pop());
        System.out.println("After poping element:");
        nums.show();

        System.out.println("size of the stack:" + nums.size());

        System.out.println("Is stack empty:" + nums.isEmpty());
       
    }
}
