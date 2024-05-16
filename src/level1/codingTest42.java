package level1;

public class codingTest42 {
    public static void main(String[] args) {

        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        System.out.println(Solution42.solution(wallpaper));
        for(int i:Solution42.solution(wallpaper)){
            System.out.println(i);
        }

    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> 바탕화면 정리
class Solution42 {
    public static int[] solution(String[] wallpaper) {
        int lux = 0;
        int luy = 0;
        int rdx = 0;
        int rdy = 0;
        boolean firstYn = true; // 처음 발견 된 #인지

        for(int i=0; i< wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].substring(j,j+1).equals("#")){
                    if(firstYn){ // 처음 발견 된 #일 시 모든 네 점(lux, luy, rdx, rdy 해당 i또는j값으로 설정)
                        firstYn = false;

                        lux = i;
                        luy = j;
                        rdx = i;
                        rdy = j;
                    }else{
                        if(lux > i){
                            lux = i;
                        }
                        if(luy > j){
                            luy = j;
                        }
                        if(rdx<i){
                            rdx = i;
                        }
                        if(rdy<j){
                            rdy = j;
                        }
                    }
                }
            }
        }

        int[] answer = {lux, luy, rdx+1, rdy+1};


        return answer;
    }
}