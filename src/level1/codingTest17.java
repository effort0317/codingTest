package level1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class codingTest17 {
    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        int left = 24;
        int right = 27;
        System.out.println("The answer is "+solution17.solution(left, right));
//        System.out.println("start");
//        for(int i:solution16.solution(N,stages)){
//            System.out.println(i);
//        }
//        System.out.println("end");
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>약수의 갯수와 덧셈
class Solution17 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left;i<=right;i++){
            if(getDivisorCnt(i)%2 ==1){
                answer = answer - i;
            }else{
                answer = answer + i;
            }
        }
        return answer;
    }
    public int getDivisorCnt(int number){
        int count = 0;

        for(int i=1;i<=number;i++){
            if(number%i ==0){
                count++;
            }
        }
        return count;
    }
}