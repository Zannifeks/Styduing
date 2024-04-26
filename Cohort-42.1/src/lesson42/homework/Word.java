package lesson42.homework;

public class Word {
    private String word;
    private Integer id;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }
}
