package codingtest.level1;

public class Programmers147355 {
    public static void main(String[] args) {
        Programmers147355 programmers147355 = new Programmers147355();
        int result = programmers147355.solution("3141592", "271");
        System.out.println(result);
    }

    public int solution(String t, String p) {
        int answer = 0;

        int pLength = p.length();
        int tLength = t.length();

        for(int i=0; i<tLength - pLength +1; i++) {
            //Integer.parseInt썼는데 런타임에러남. p의 길이 1<=p<=18 이어서 Long으로 바꿈
            Long tSplit = Long.parseLong(t.substring(i,pLength+i));
            Long intP = Long.parseLong(p);

            if(tSplit<=intP) {
                answer++;
            }
        }

        return answer;
    }
}
