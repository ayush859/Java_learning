import java.util.*;

class Pair {

    int freq;
    char ch;

    Pair(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }
}

class Solution {

    public List<Character> sort_by_freq(String str) {
        Pair[] arr_pair = new Pair[26];

        for (int i = 0; i < 26; i++) {

            arr_pair[i] = new Pair(0, (char) ('a' + i));

        }

        for (char c : str.toCharArray()) {
            arr_pair[c - 'a'].freq++;
        }

        Arrays.sort(arr_pair, (p1, p2) -> {

            if (p1.freq != p2.freq)
                return p2.freq - p1.freq;

            return p1.ch - p2.ch;
        });

        List<Character> result = new ArrayList<>();

        for (Pair p : arr_pair) {
            if (p.freq == 0)
                break;

            result.add(p.ch);
        }

        return result;

    }
}

class _08_Sort_Characters_By_Frequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");

        String str = sc.nextLine();

        Solution sol = new Solution();

        List<Character> answer = sol.sort_by_freq(str);

        System.out.println("Chars sorted by freq: " + answer);

    }

}
