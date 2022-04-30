import java.util.Arrays;
import java.util.LinkedHashSet;


// 출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>2022 KAKAO BLIND RECRUITMENT>신고 결과 받기
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];
        
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(report));
        String[] distinctReport = linkedHashSet.toArray(new String[0]); // 중복 제거 된 report

        

        int[] count = new int[id_list.length]; // 신고된 횟수
        for(int i=0; i<id_list.length; i++){
            count[i] = 0;
            answer[i] = 0;
        }
        String[] reported = new String[distinctReport.length]; // 신고당한 사람 목록(중복 허용 X)
        String[] reporter = new String[distinctReport.length]; // 신고한 사람 목록(중복 허용 X)

        for(int i=0; i<distinctReport.length;i++){
            String[] tempReported = distinctReport[i].split(" ");    
            reported[i] = tempReported[1].replace(" ","");
            reporter[i] = tempReported[0].replace(" ","");
        }

        for(int i=0; i<distinctReport.length; i++){
            System.out.println("reported is"+reported[i]+"1");
            for(int j=0; j<id_list.length;j++){
                System.out.println("id_list is "+id_list[j]);
                if(id_list[j].equals(reported[i])){
                    
                    count[j]++;
                }
            }
        }

        for(int i=0; i<count.length; i++){
            System.out.println("count is "+count[i]);
            if(count[i]>=k){
                for(int j=0; j<distinctReport.length; j++){
                    if(id_list[i].equals(reported[j])){
                        for(int l=0;l<id_list.length;l++){
                            if(reporter[j].equals(id_list[l])){
                                answer[l]++;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}