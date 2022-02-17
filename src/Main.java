import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        int[] alpha = new int[26];

        for (int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - 'A'] += 1;
        }

        int midIdx = 0;
        int odd = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] % 2 != 0) { // 홀수인 경우
                midIdx = i;
                odd++;
            }
        }

        if ((str.length() % 2 != 0 && odd > 1) || (str.length() % 2 == 0 && odd > 0)) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            String answer = "";
            for (int i = 0; i < alpha.length; i++) {

                for (int j = 0; j < alpha[i] / 2; j++) {
                    answer += (char) (i + 'A');
                }
            }

            StringBuilder tmp = new StringBuilder(answer);
            StringBuilder reverse = tmp.reverse();

            if (odd == 1) {
                answer += (char) (midIdx + 'A');
            }

            System.out.println(answer + reverse);

        }

    }


}