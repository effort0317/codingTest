package level1;

import java.util.*;


public class codingTest45 {
    public static void main(String[] args) {

        System.out.println(Solution45.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));


    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 카드 뭉치
class Solution45 {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        List<String> listCards1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> listCards2 = new ArrayList<>(Arrays.asList(cards2));

        for(String s : goal){
            boolean flag = false;
            if(listCards1.size() > 0 && listCards1.get(0).equals(s)){
                listCards1.remove(0);
                flag = true;
            }
            if(listCards2.size() > 0 && listCards2.get(0).equals(s)){
                listCards2.remove(0);
                flag = true;
            }
            if(!flag) {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}