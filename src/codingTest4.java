import java.util.HashMap;
import java.util.Map;

public class codingTest4 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "2three45sixseven";
        System.out.println("The answer is "+solution.solution(s));
    }
}

// 출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>숫자 문자열과 영단어
class Solution {
    public int solution(String s) {
        Map<String, String> map = new HashMap<>();
        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");

        String answerS = s;
        for(Map.Entry<String, String> el : map.entrySet()){
            answerS = answerS.replace(el.getKey(),el.getValue());
        }
        int answerI = Integer.parseInt(answerS);
        return answerI;
    }
}
