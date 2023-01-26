package codingtest.level1;

import java.util.Arrays;

public class Programmers142086 {

    public static void main(String[] args) {
        Programmers142086 programmers142086 = new Programmers142086();
        int[] result = programmers142086.solution("banana");
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;

        for(int i=1; i<s.length(); i++) {
            String iChar = String.valueOf(s.charAt(i));
            String ss = s.substring(0,i);
            if(!ss.contains(iChar)) {
                answer[i] = -1;
            } else {
                answer[i] = i-(ss.lastIndexOf(iChar));
            }
        }

        return answer;
    }
}
