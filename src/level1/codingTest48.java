package level1;


import java.util.HashMap;
import java.util.Map;

public class codingTest48 {
    public static void main(String[] args) {
        int[] answer = Solution48.solution("banana");
        for(int idx=0;idx<answer.length;idx++){
            System.out.println(answer[idx]);
        }
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 가장 가까운 같은 글자
class Solution48 {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            String alphabet = s.substring(i,i+1);

            if(map.get(alphabet) == null){
                answer[i] = -1;
            } else {
                int formerIndex = map.get(alphabet);
                answer[i] = i-formerIndex;
            }
            map.put(alphabet,i);
        }
        return answer;
    }
}