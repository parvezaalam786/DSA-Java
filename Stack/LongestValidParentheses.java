package Stack;

import java.util.Stack;

/*
https://leetcode.com/problems/longest-valid-parentheses/

We are using stack here for finding the longest valid parentheses. We will traverse the
string from left. If '(' then will push the character else if top of stack is '(' and current
character is ')' then we will pop the character, else push the character(')'). After this process we will 
have the indices in the stack where the parentheses becomes unbalanced.

answer = terminalLen - stackTop - 1
and we will return the maximum over all.
*/
class Solution{
    public int longestValidParentheses(String s) {
        if(s == null || s.length() < 2){
            return 0;
        }

        Stack<Integer> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stk.push(i);
            }
            else{
                if(!stk.empty() && s.charAt(stk.peek()) == '('){
                    stk.pop();
                }
                else{
                    stk.push(i);
                }
            }
        }

        int maxLen = 0;
        int endTerminal = s.length();

        while(!stk.empty()) {
            
            int startTerminal = stk.pop();
            maxLen = Math.max(maxLen, endTerminal - startTerminal - 1);
            endTerminal = startTerminal;
        }

        return Math.max(endTerminal, maxLen);
    }
}