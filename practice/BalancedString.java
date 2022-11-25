package com.practice;

import java.util.Stack;

public class BalancedString {

    public static boolean checkBalanced(String check) {
        Stack<Character> S = new Stack<Character>();
        for(int a = 0; a < check.length(); a++){
            char let = check.charAt(a);
            if(let == '[' || let == '{' || let == '(')
                S.push(let);
            else if(let == ']' || let == '}' || let == ')')
            {
                if(S.empty())
                    return false;
                switch(let)
                {
                    // Opening square brace
                    case ']':
                        if (S.pop() != '[')
                            return false;
                        break;
                    // Opening curly brace
                    case '}':
                        if (S.pop() != '{')
                            return false;
                        break;
                    // Opening paren brace
                    case ')':
                        if (S.pop() != '(')
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }
        if(S.empty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String input = "{{[]}}";
        System.out.println(BalancedString.checkBalanced(input));
    }

}
