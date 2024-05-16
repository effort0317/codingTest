package level1;



import java.util.*;

public class codingTest27 {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();

        System.out.println("start");
        System.out.println("the answer is "+solution27.solution(new int[]{1,3,5,9}, 3));
        System.out.println("end");
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 나누어 떨어지는 숫자 배열
class Solution27 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> answerList = new ArrayList<>();

        for(int i : arr){
            if(i%divisor == 0) answerList.add(new Integer(i));
        }
        if(answerList.size() == 0) answer = new int[]{-1};
        else{
            answer = new int[answerList.size()];
            for(int i=0;i<answerList.size();i++){
                answer[i] = answerList.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}