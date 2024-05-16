package level2;


import java.util.Stack;

public class codingTest11 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();

        System.out.println(solution11.solution("cdcd"));
    }
}


// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>짝지어 제거하기
class Solution11 {
    public int solution(String s) {
        int answer = 1;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(stack.peek() == c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        if(!stack.isEmpty()) answer=0;

        return answer;
    }
}