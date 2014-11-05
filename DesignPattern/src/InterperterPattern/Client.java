package InterperterPattern;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Context cxt = new Context();

        Stack<Expression> stack = new Stack<Expression>();
//        for(;;)
//        {
//            //进行语法判断产生递归
//        }
        Expression exp = stack.pop();
        exp.interpreter(cxt);
    }
}
