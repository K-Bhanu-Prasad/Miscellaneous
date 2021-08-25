package CodeWarsPrograms;

/**
 * Input: exp = “[()]{}{[()()]()}”
 * Output: Balanced
 *
 * Input: exp = “[(])”
 * Output: Not Balanced
 */
public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "[()]{}{[()()]()}(){}{()}";
        boolean result = isBalancedBrackets(s);
        if(result) System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    private static boolean isBalancedBrackets(String s) {
        BalancedStack stack = new BalancedStack(s.length());
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='[' || ch == '(' || ch == '{'){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) return false;
                if(!isMachingPair(stack.pop(), ch)) return false;
            }

        }
        return true;
    }

    private static boolean isMachingPair(char pop, char ch) {
        if(pop == '(' && ch ==')') return true;
        if(pop == '[' && ch ==']') return true;
        if(pop == '{' && ch =='}') return true;
        return false;
    }

    static class BalancedStack{
        int top = 0;
        char stack[];
        BalancedStack(int size){
            this.stack = new char[size];
        }

        void push(char str){
            stack[top++] = str;
        }
        char pop(){
            char ch =  stack[--top];
            stack[top] = ' ';
            return ch;
        }
        boolean isEmpty(){
            if(stack.length == 0) return true;
            else return false;
        }
    }
}
