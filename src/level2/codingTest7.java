package level2;


import java.util.*;

public class codingTest7 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        System.out.println("start");
        for(int i : solution7.solution(6, 4, picture)){
            System.out.println(i);
        }
        System.out.println("finish");

    }
}


// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습>카카오프렌즈 컬러링북
class Solution7 {
    boolean checked[][];
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        checked = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((picture[i][j] !=0)&&(checked[i][j]!=true)){
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, area(i,j,picture,m,n));
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public int area(int i, int j, int[][] picture, int m, int n){
        int range = 1;
        checked[i][j] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});

        while(!queue.isEmpty()){
            int[] point = queue.poll();
            int x = point[0];
            int y = point[1];

            for(int idx=0;idx<4;idx++){
                int tempX = x+dx[idx];
                int tempY = y+dy[idx];

                if((tempX>=0)&&(tempX<m)&&(tempY>=0)&&(tempY<n)){
                    if((picture[tempX][tempY] == picture[i][j])&&(checked[tempX][tempY]!=true)){
                        checked[tempX][tempY] = true;
                        range++;
                        queue.offer(new int[]{tempX, tempY});
                    }
                }
            }
        }
        return range;
    }
}