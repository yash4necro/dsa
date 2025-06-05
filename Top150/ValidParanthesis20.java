import java.util.Stack;

class ValidParanthesis20 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        if (s.equals(""))
            return true;
        char ch[] = s.toCharArray();
        boolean boo = false;
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '[' || ch[i] == '{') {
                stk.push(ch[i]);
            } else {
                if (stk.empty())
                    return false;
                if (getValidity(stk.pop(), ch[i]))
                    boo = true;
                else
                    return false;
            }
        }
        if (!stk.empty())
            return false;
        return boo;
    }

    public boolean getValidity(char c, char s) {
        if ((c == '(' && s == ')')
                || (c == '[' && s == ']')
                || (c == '{' && s == '}'))
            return true;
        else
            return false;
    }
}