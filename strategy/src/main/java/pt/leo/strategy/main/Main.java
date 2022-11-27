package pt.leo.strategy.main;

import pt.leo.strategy.core.Dictionary;
import pt.leo.strategy.core.Translator;

public class Main {
    public static void main(String[] args) {
        String word = "house";

        Dictionary dictionary = new EnglishToPortugueseDictionary();
        Translator translator = new Translator(dictionary);
        System.out.println("Translating '" + word + "' to Portuguese: " + translator.translate(word));

        dictionary = new EnglishToFrenchDictionary();
        translator = new Translator(dictionary);
        System.out.println("Translating '" + word + "' to French: " + translator.translate(word));
    }
}
