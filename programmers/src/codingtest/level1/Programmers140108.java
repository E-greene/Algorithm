package codingtest.level1;

import java.util.List;

public class Programmers140108 {

    public static void main (String args[]) {
        Programmers140108 programmers140108 = new Programmers140108();
        int result = programmers140108.solutionFail("banana");
        System.out.println(result);
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
