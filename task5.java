
import java.util.ArrayDeque;
import java.util.Deque;

public class task5 {

    // Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']',
    // определите,
    // является ли входная строка логически правильной.
    // Входная строка логически правильная, если:
    // 1) Открытые скобки должны быть закрыты скобками того же типа.
    // 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая
    // закрывающая скобка имеет соответствующую
    // открытую скобку того же типа.
    // ()[] = true
    // () = true
    // {[()]} = true
    // ()() = true
    // )()( = false

    public static void main(String[] args) {
        System.out.println(validate("()[]"));
        System.out.println(validate("()"));
        System.out.println(validate("{[()]}"));
        System.out.println(validate("()()"));
        System.out.println(validate(")()("));

    }

    public static boolean validate(String input) {
        Deque<Character> symbol = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                symbol.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (symbol.isEmpty()) {
                    return false;
                }
                char last = symbol.peek();
                if (c == ')' && last == '('|| c == ']' && last == '[' || c == '}' && last == '{') {
                    symbol.pop();
                }
                else {
                    return false;
                }
            }
                
        }
        return symbol.isEmpty();
    }
}