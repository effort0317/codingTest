package level1;

public class codingTest3 {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();

    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>2021 KAKAO BLIND RECRUITMENT>신규 아이디 추천
class Solution3 {
    public String solution(String new_id) {
        String id = new_id.toLowerCase(); // 소문자로
        id = id.replaceAll("[^-_.a-z0-9]", ""); //-_. 영문자 숫자만 남김
        id = id.replaceAll("[.]{2,}", "."); // .2개 이상 .으로
        id = id.replaceAll("^[.]|[.]$", ""); // 처음과 끝 . 제거

        if(id.equals("")) // 빈 문자열이라면 a 추가
            id += "a";

        if(id.length() >= 16){ // 16자 이상이면 15자로
            id = id.substring(0, 15);
            id = id.replaceAll("^[.]|[.]$", ""); // 끝 . 제거
        }
        if(id.length() <= 2) // 2자 이하라면 3자까지 마지막 문자추가
            while(id.length() < 3)
                id += id.charAt(id.length() - 1);

        return id;
    }
}