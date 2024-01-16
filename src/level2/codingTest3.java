package level2;


import java.util.*;

public class codingTest3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println("start");

        for(int i:solution3.solution(progresses, speeds)){
            System.out.println("The answer is "+i);
        }

        System.out.println("end");
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>기능개발
class Solution3 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<progresses.length;i++){
            int completeDy = 0; // 각 작업마다 배포 가능일

            if((progresses[i] == 100)){
                completeDy = 0;
            }else{
                completeDy = (100-progresses[i])/speeds[i];
                if((100-progresses[i])%speeds[i] != 0){
                    completeDy++;
                }
            }
            queue.add(completeDy); // 작업 순서대로 큐에 추가
        }

        while(!queue.isEmpty()){
            int count = 1;
            int aCompleteDy = queue.poll();

            while(!queue.isEmpty() && aCompleteDy >= queue.peek()){
                count++;
                queue.poll();
            }
            answerList.add(new Integer(count));
        }

        int[] answer = new int[answerList.size()];
        for(int i=0; i< answerList.size();i++){
            answer[i] = answerList.get(i).intValue();
        }

        return answer;
    }
}