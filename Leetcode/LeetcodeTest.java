package Leetcode;

public class LeetcodeTest {

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1, word2));

    }


    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = addString(word1);
        String str2 = addString(word2);

        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }


    static String addString(String[] wordArr) {
        String word = "";
        for (int i = 0; i < wordArr.length; i++) {
            word += wordArr[i];
        }
        return word;
    }
}
