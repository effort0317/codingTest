package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class codingTest8 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println("The answer is "+solution8.solution(absolutes, signs));
    }
}
// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>음양 더하기
class Solution8 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0;i< signs.length;i++){
            if(signs[i]){
                answer=answer+absolutes[i];
            }else{
                answer=answer-absolutes[i];
            }
        }
        return answer;
    }
}
