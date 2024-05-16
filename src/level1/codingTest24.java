package level1;


public class codingTest24 {
    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();

        System.out.println("start");
        for(String s : solution24.solution(6,new int[]{46, 33, 33 ,22, 31, 50},new int[]{27 ,56, 19, 14, 14, 10})){
            System.out.println(s);
        }
        System.out.println("end");

    }
}

// 문제출처 : 프로그래머스(https://www.programmers.co.kr)>코딩테스트 연습> [1차] 비밀지도
class Solution24 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] newArr1 = new int[n][n];
        int[][] newArr2 = new int[n][n];

        for(int i=0;i<n;i++){
            newArr1[i] = toBinary(arr1[i],n);
            newArr2[i] = toBinary(arr2[i],n);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    answer[i] = "";
                }
                if ((newArr1[i][j] == 0) &&(newArr2[i][j]==0)){
                    answer[i] = answer[i]+" ";
                }else{
                    answer[i] = answer[i]+"#";
                }
            }
        }
        return answer;
    }

    public int[] toBinary(int arr, int n){
        int[] binary = new int[n];
        int idx = n-1;
        while(arr !=0){
            binary[idx] = arr%2;
            idx--;
            arr = arr/2;
        }
        return binary;
    }
}