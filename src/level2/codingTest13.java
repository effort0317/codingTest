package level2;


public class codingTest13 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();

        System.out.println(solution13.solution("10  1"));
//        String i=" ";
//        i = i.substring(0,1).toUpperCase()+i.substring(1, i.length());
//        System.out.println("i = "+i);
    }
}


// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>JadenCase 문자열 만들기
class Solution13 {
    public String solution(String s) {
        String answer = "";
        String[] split = s.toLowerCase().split(" ");

//        for(int i=0;i< split.length;i++){
//            if(split[i].indexOf(" ")<0){
//                System.out.println("i = "+i);
//                System.out.println("split is "+split[i]);
//                answer += split[i].substring(0,1).toUpperCase()+split[i].substring(1, split[i].length()); // 첫 번째 글자 대문자 전환
//            }
//            if(i < split.length-1){
//                answer += " ";
//            }
//        }
//        for(int i=0;i< split.length;i++){
//            System.out.println(split[i]);
//        }

        return answer;
    }
}