package level1;

import java.util.*;

public class codingTest44 {
    public static void main(String[] args) {

//        System.out.println(Solution44.solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"}));
        for(int i:Solution44.solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"})){
            System.out.println(i);
        }

    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 대충 만든 자판
class Solution44 {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> map = new HashMap<>();

        for(String s : keymap){
            for(int i=0;i<s.length();i++){
                String alphabet = s.substring(i,i+1);
                if(map.get(alphabet) != null){
                    int order = map.get(alphabet);
                    if((i+1)<order) map.put(alphabet,i+1);
                }else{
                    map.put(alphabet,i+1);
                }
            }
        }

        int index = 0;
        for(String target : targets){
            int count = 0;
            for(int i=0;i<target.length();i++){
                String targetAlphabet = target.substring(i,i+1);
                if(map.get(targetAlphabet) == null){
                    count = -1;
                    break;
                }else{
                    count +=map.get(targetAlphabet);
                }
            }
            answer[index] = count;
            index++;
        }

        return answer;
    }
}