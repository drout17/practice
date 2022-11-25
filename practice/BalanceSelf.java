package com.practice;

import java.util.Stack;

public class BalanceSelf {

    public static void main(String[] args) {
        String input ="{}[][[()]]";
        if(BalanceSelf.testString(input))
            System.out.println(input +" is Balanced");
        else
            System.out.println(input +" is not Balanced");
    }

    public static Boolean testString(String input){

        Stack<Character> myStack = new Stack<>();
        System.out.println(myStack.empty());
        Character ch;

        for(int i=0;i<input.length();i++)
        {
            ch = input.charAt(i);
            if(ch=='{'||ch=='['||ch=='(')
            {
                myStack.push(ch);
            }
            else if(ch=='}'||ch==']'||ch==')')
            {
                if(myStack.empty())
                    return false;

                switch(ch){
                    case '}':
                            if(myStack.pop()!='{')
                                return false;
                            break;
                    case ']':
                            if(myStack.pop()!='[')
                                return false;
                            break;
                    case ')':
                            if(myStack.pop()!='(')
                                return false;
                            break;
                    default:
                        break;
                }
            }
        }
        if(myStack.empty())
            return true;
        return false;
    }
}
