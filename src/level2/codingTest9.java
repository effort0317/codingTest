package level2;


import java.util.Stack;

public class codingTest9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();

        System.out.println(solution9.solution(")()("));
    }
}


// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>올바른 괄호
class Solution9 {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push("(");
            }else if(s.charAt(i) == ')'){
                if((!stack.isEmpty())&&(stack.peek() =="(")) stack.pop();
                else stack.push(")"); // s가 ")"경우 false를 return 해야함.
            }
        }
        boolean answer = stack.isEmpty();

        return answer;
    }
}