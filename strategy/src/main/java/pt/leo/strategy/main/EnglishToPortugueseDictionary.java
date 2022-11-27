package pt.leo.strategy.main;

import pt.leo.strategy.core.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class EnglishToPortugueseDictionary implements Dictionary {
    Map<String, String> translations = new HashMap<>() {{
        put("house", "casa");
        put("money", "dinheiro");
        put("table", "mesa");
    }};

    @Override
    public String translate(String word) {
        return translations.get(word);
    }
}
