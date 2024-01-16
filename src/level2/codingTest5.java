package level2;


import java.util.*;

public class codingTest5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        String s = "aabbaccc";

        System.out.println("The answer is "+solution5.solution(s));
    }
}


// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>문자열 압축
class Solution5 {
    public int solution(String s) {
        int[] length = new int[s.length()/2]; // 각 반복되는 갯수마다의 문자열 길이, 인덱스 : 반복되는 갯수-1

        for(int i=1;i<=s.length()/2;i++){ // i는 반복되는 문자 갯수
            int sameCnt = 1;
            List<Integer> sameCntList = new ArrayList<>();

            for(int j=0;j<s.length()/i;j++){
                String formerStr = "";
                if(j!=0){
                    String subStr = s.substring(j*i, (j+1)*i);
                    if(formerStr.equals(subStr)){
                        sameCnt++;
                    }else{
                        if(sameCnt>1){
                            sameCntList.add(new Integer(sameCnt));
                        }
                        formerStr = subStr;
                        sameCnt = 1;
                    }
                }else{
                    formerStr = s.substring(0,i);
                }
            }
            if(sameCnt>1){
                sameCntList.add(new Integer(sameCnt));
            }
            length[i-1] = s.length();

            if(!sameCntList.isEmpty()){
                for(int k:sameCntList){
                    length[i-1] = length[i-1]-((k-1)*i)+(k/10)+1;
                }
            }
        }
        Arrays.sort(length);
        int answer = length[0];

        return answer;
    }
}