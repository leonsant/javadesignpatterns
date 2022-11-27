package pt.leo.strategy.main;

import pt.leo.strategy.core.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class EnglishToFrenchDictionary implements Dictionary {
    Map<String, String> translations = new HashMap<>() {{
        put("house", "loger");
        put("money", "argent");
        put("table", "table");
    }};

    @Override
    public String translate(String word) {
        return translations.get(word);
    }
}
