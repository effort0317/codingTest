package level1;


import java.util.*;

public class codingTest56 {
    public static void main(String[] args) {
        System.out.println(Solution56.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습 > 햄버거 만들기
class Solution56 {
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> hamburger = new Stack<>();

        for(int i : ingredient){
            hamburger.push(i);

            int hamburgerSize = hamburger.size();
            if(hamburgerSize > 3){
                if(hamburger.get(hamburgerSize-1) == 1
                && hamburger.get(hamburgerSize-2) == 3
                && hamburger.get(hamburgerSize-3) == 2
                && hamburger.get(hamburgerSize-4) == 1){
                    answer++;
                    hamburger.pop();
                    hamburger.pop();
                    hamburger.pop();
                    hamburger.pop();
                }
            }
        }

        return answer;
    }
}