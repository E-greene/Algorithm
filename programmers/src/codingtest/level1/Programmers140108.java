package codingtest.level1;

import java.util.List;

public class Programmers140108 {

    public static void main (String args[]) {
        Programmers140108 programmers140108 = new Programmers140108();
        int result = programmers140108.solution("aaabbaccccabba");
        System.out.println(result);
    }

    public int solution(String s) {
        int answer = 0;

        char c = s.charAt(0);
        int countEqual = 0;
        int countNonEqual =0;

        for(int i = 0; i< s.length(); i++) {

            if(s.charAt(i) == c) {
                countEqual++;
            }else {
                countNonEqual++;
            }

            if(countEqual == countNonEqual) {
                answer++;
                if(i+1 == s.length()) {
                    break;
                }else {
                    c = s.charAt(i+1);
                }
            }
        }
        if(countEqual>countNonEqual) {
            answer++;
        }

        return answer;
    }

    //시간초과 뜸
    public int solutionFail(String s) {
        int answer = 0;
        String ss = s;

        while(ss.length()!=0){
            int countEqual = 0;
            int countNonEqual =0;
            for(int i = 0; i< ss.length(); i++) {

                if(ss.charAt(i) == ss.charAt(0)) {
                    countEqual++;
                }else {
                    countNonEqual++;
                }

                if(countEqual == countNonEqual) {
                    ss = ss.substring(i+1);
                    answer++;
                    break;
                }
            }
            if(ss.length() == 1){
                answer++;
                break;
            }
        }
        return answer;
    }


}
