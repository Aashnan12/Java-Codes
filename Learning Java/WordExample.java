public class WordExample {
    private String strdata;

    public WordExample(String str) {
        this.strdata = str;
    }

    void countWord() {
        String[] words = strdata.split(" +");
        int count = 0;
        for (String word : words) {
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                count++;
            }
        }
        System.out.println(count);
    }

    void placeWord() {
        String[] words = strdata.split(" +");
        StringBuilder vowelWords = new StringBuilder();
        StringBuilder otherWords = new StringBuilder();
        for (String word : words) {
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                vowelWords.append(word).append(" ");
            } else {
                otherWords.append(word).append(" ");
            }
        }
        System.out.println(vowelWords.toString().trim() + " " + otherWords.toString().trim());
    }

    private boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        WordExample we = new WordExample("ASK A QUESTION OR ANSWER IT");
        we.countWord();
        we.placeWord();
    }
}
