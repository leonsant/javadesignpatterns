package pt.leo.strategy.core;

public class Translator {
    Dictionary dictionary;

    public Translator(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String translate(String word) {
        return dictionary.translate(word);
    }
}
