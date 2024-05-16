package level1;

import java.util.HashMap;

public class codingTest40 {
    public static void main(String[] args) {
//        Solution40 solution = new Solution40();

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(Solution40.solution(name, yearning, photo));
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 추억 점수
class Solution40 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i< name.length;i++){
            map.put(name[i], yearning[i]);
        }

        for(int idx=0;idx< photo.length;idx++){
            answer[idx] = 0;
            for(String person : photo[idx]){
                if(map.get(person) != null){
                    answer[idx] += map.get(person);
                }
            }
        }
        return answer;
    }
}