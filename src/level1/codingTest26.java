package level1;


import java.util.*;

public class codingTest26 {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        
        System.out.println("the answer is "+solution26.solution("1D2S#10S"));

    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> [1차] 다트 게임
class Solution26 {
    int[] answerArray = new int[3];

    public int solution(String dartResult) {
        int answer = 0;
        List<String> resultList = new ArrayList<>();

        int preIndex = 0;
        int dartResultLen = dartResult.length();
        for(int i=1;i<dartResultLen;i++){
            if(Character.isDigit(dartResult.charAt(i))){
                if(!Character.isDigit(dartResult.charAt(i-1))){
                    resultList.add(dartResult.substring(preIndex, i));
                    preIndex = i;
                }
            }
        }
        resultList.add(dartResult.substring(preIndex, dartResultLen));

        for(int i=0;i<resultList.size();i++){
            answerArray[i] = sdt(resultList.get(i));
            prize(resultList, i);
        }

        for(int i : answerArray){
            System.out.println("i is "+i);
            answer += i;
        }

        return answer;
    }
    public int sdt(String s){
        int idx = 1;
        String sdt = "S";

        if(s.indexOf("S")>-1){
            idx = s.indexOf("S");
        }
        if(s.indexOf("D")>-1){
            idx = s.indexOf("D");
            sdt = "D";
        }
        if(s.indexOf("T")>-1){
            idx = s.indexOf("T");
            sdt = "T";
        }
        int answer = Integer.parseInt(s.substring(0,idx));

        switch (sdt){
            case "D" : answer = answer*answer;
                break;
            case "T" : answer = answer*answer*answer;
                break;
            default:
                break;
        }

        return answer;
    }
    public void prize(List<String> resultList, int idx){
        if(resultList.get(idx).indexOf("*")>-1){
            if(idx==0){
                answerArray[0] = 2*answerArray[0];
            }else{
                answerArray[idx] = 2*answerArray[idx];
                answerArray[idx-1] = 2*answerArray[idx-1];
            }
        }else if(resultList.get(idx).indexOf("#")>-1){
            answerArray[idx] = -1*answerArray[idx];
        }
    }
}