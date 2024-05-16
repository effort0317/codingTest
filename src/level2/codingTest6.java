package level2;


import java.util.*;

public class codingTest6 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        System.out.println("start");
        for(String s : solution6.solution(record)){
            System.out.println(s);
        }
        System.out.println("finish");

    }
}


// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>오픈 채팅방
class Solution6 {
    public String[] solution(String[] record) {
        List<String> answerList = new ArrayList<>();
        Map<String, String> userMap = new HashMap<>(); // <아이디, 닉네임>

        for(int i=0;i< record.length;i++){
            String[] user = record[i].split(" ");
            String act = "";

            if(user.length ==3){
                userMap.put(user[1], user[2]);
            }

            switch (user[0]){
                case "Enter": act = "님이 들어왔습니다.";
                    break;
                case "Leave": act = "님이 나갔습니다.";
                    break;
                default:
                    break;
            }
            if(act !=""){
                answerList.add(user[1]+act);
            }
        }

        String answer[] = answerList.toArray(new String[answerList.size()]);

        for(int i=0;i< answer.length;i++){
            int idx = answer[i].indexOf("님");
            answer[i] = userMap.get(answer[i].substring(0,idx))+"님이 "+answer[i].substring(idx+3);
        }

        return answer;
    }
}