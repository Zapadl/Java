package lekcii;
//Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
public class les2_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcddsdf";
        String result = null;
        StringBuilder sb = new StringBuilder(str.substring(0,1));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i-1))
                sb.append(str.charAt(i));

        }
        System.out.println(sb);
    }
}

