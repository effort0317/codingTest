package level2;


import java.util.*;

public class codingTest4 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println("The answer is "+solution4.solution(scoville, K));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>더 맵게
class Solution4 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scovilleQue = new PriorityQueue<>();

        for(int i:scoville){
            scovilleQue.offer(new Integer(i));
        }

        while((scovilleQue.peek() <= K)&&(scovilleQue.size()>=2)){
            scovilleQue.offer(new Integer(scovilleQue.poll()+2*scovilleQue.poll()));
            answer++;
        }
        if(scovilleQue.peek() < K) answer = -1;
        
        return answer;
    }
}