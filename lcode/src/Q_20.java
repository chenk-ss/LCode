import java.util.Stack;

/**
 * @Author chenk
 * @create 2021/1/14 22:59
 */
public class Q_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Character a;
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            if (a == '(' || a == '[' || a == '{') {
                stack.push(a);
            } else {
                if (stack.empty()) return false;
                if (a == ')' && stack.pop() != '(') return false;
                if (a == ']' && stack.pop() != '[') return false;
                if (a == '}' && stack.pop() != '{') return false;
            }
        }
        return stack.empty();
    }
}
