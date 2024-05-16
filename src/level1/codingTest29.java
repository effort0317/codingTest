package level1;


import java.util.*;

public class codingTest29 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();

        System.out.println("start");
        for(String s : solution29.solution(new String[]{"sun", "bed", "car"}, 1)){
            System.out.println(s);
        }
        System.out.println("end");
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 문자열 내 마음대로 정렬하기
class Solution29 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        List<String> stringsList = new ArrayList<>(Arrays.asList(strings));
        String[] answer = new String[strings.length];

        for(int i=0;i<strings.length;i++){
            answer[i] = stringsList.get(i).substring(n, n+1);
        }
        Arrays.sort(answer);

        for(int i=0;i< answer.length;i++){
            for(int j=0;j<stringsList.size();j++){
                if(stringsList.get(j).substring(n, n+1).equals(answer[i])){
                    answer[i] = stringsList.get(j);
                    stringsList.remove(j);
                    break;
                }
            }
        }
        return answer;
    }
}