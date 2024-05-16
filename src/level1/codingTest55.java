package level1;


import java.util.*;

public class codingTest55 {
    public static void main(String[] args) {
        int[] answer = Solution55.solution("2022.05.19"
                , new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});

        for(int i=0 ;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 개인정보 수집 유효기간
class Solution55 {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        List<Integer> answerList = new ArrayList<>();

        for(String term : terms) {
            String rule = term.split(" ")[0];
            String aTerm = term.split(" ")[1];

            termMap.put(rule, Integer.parseInt(aTerm));
        }

        for(int i=0; i< privacies.length; i++) {
            String startDate = privacies[i].split(" ")[0];
            String privacyRule = privacies[i].split(" ")[1];

            String expireDate = getExpireDate(startDate, termMap.get(privacyRule));

            int intToday = Integer.parseInt(today.replaceAll("\\.",""));
            int intExpireDate = Integer.parseInt(expireDate.replaceAll("\\.",""));

            if(intToday >= intExpireDate){
                answerList.add(i+1);
            }
        }

        int[] answer = new int[answerList.size()];

        for(int i=0;i< answer.length;i++){
            answer[i] = answerList.get(i).intValue();
            System.out.println("answer is "+answer[i]);
        }

        return answer;
    }

    private static String getExpireDate(String startDate, int term) {
        String expireDate = "";

        String startYear = startDate.split("\\.")[0];
        String startMonth = startDate.split("\\.")[1];
        String startDay = startDate.split("\\.")[2];

        int endMonth = Integer.parseInt(startMonth)+term;

        int plusYear = endMonth/12;
        int plusMonth = endMonth%12;

        String expireYear = Integer.toString(Integer.parseInt(startYear)+plusYear);

        String expireMonth = Integer.toString(plusMonth);
        if(expireMonth.length()==1) expireMonth = "0"+expireMonth;

        String expireDay = startDay;

        expireDate = expireYear+expireMonth+expireDay;

        return expireDate;
    }
}