package level1;

import java.util.HashMap;

public class codingTest11 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println("The answer is "+solution11.solution(participant, completion));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>완주하지 못한 선수
class Solution11 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> participantMap = new HashMap<>();

        for(String aParticipant : participant){
            participantMap.put(aParticipant, participantMap.getOrDefault(aParticipant, 0)+1);
        }
        for(String aCompletion : completion){
            participantMap.put(aCompletion, participantMap.get(aCompletion)-1);
        }
        for(String aParticipant : participantMap.keySet()){
            if(participantMap.get(aParticipant) !=0){
                answer = aParticipant;
            }
        }

        return answer;
    }
}