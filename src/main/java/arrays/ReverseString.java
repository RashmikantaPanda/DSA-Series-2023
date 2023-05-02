package arrays;

public class ReverseString {
    public String reverseWord(String str) {
        // Reverse the string str
        char[] ch = str.toCharArray();

        for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

        }
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            str2.append(ch[i]);
        }
        return str2.toString();
    }

}

