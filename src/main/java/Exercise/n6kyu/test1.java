package Exercise.n6kyu;

public class test1 {
    public static void main(String[] args) {
        String word1 = "dgugsdfvcds";
        String word2 = "girafarig";
        String word3 = "asddsa";

        char[] word = word1.toCharArray();

        int Up = 0;
        int Down = word.length-1;
        Boolean simetric = true;
        for (int i=0;Up+i<Down-i;i++) {
            if (word[Up+i]!=word[Down-i]){
                simetric = false;
                break;
            }
        }
        System.out.println(simetric);
    }
}
