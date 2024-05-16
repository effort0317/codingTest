package level2;


import java.util.*;

public class codingTest12 {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();

        System.out.println(solution12.solution("-1 -2 -1"));
    }
}


// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>최댓값과 최솟값
class Solution12 {
    public String solution(String s) {
        String[] sArray = s.split(" ");
        String highest = sArray[0];
        String lowest = sArray[0];

        for(String string : sArray){
            if(Integer.parseInt(highest) < Integer.parseInt(string)) highest = string;
            if(Integer.parseInt(lowest) > Integer.parseInt(string)) lowest = string;
        }
        String answer = lowest+" "+highest;
        return answer;
    }
}