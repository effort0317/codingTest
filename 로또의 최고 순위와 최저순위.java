// 출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>로또의 최고 순위와 최저 순위
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int count = 0;
        int zeroCnt = 0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0) zeroCnt++;
            for(int idx=0; idx<6; idx++){
                if(win_nums[idx]==lottos[i]){
                    count++;
                }    
            } 
        }
        answer = new int[2];
     
        answer[0] = 7-(count+zeroCnt);
        if(count==0){
            answer[1] = 6;
        }else{
            answer[1] = 7-count;    
        }
        
        
        
        return answer;
    }
}