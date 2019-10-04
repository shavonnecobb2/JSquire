package kihons;

import framework.bases.MapKihonBase;
import framework.exceptions.NotImplementedYetException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapKihon extends MapKihonBase {

    @Override
    protected Map<String, String> createMapOfStringToString() {
        return new HashMap<>();
    }

    @Override
    protected void addKeyAndValueToMap(Map<String, String> inputMap, String key, String value) {
        inputMap.put(key, value);
    }

    @Override
    protected String getTheValueAtThisKey(Map<String, String> inputMap, String key) {
        return inputMap.get(key);
    }

    @Override
    protected boolean doesMapContainKey(Map<String, String> inputMap, String input) {
        return inputMap.containsKey(input);
    }

    @Override
    protected void removeKeyFromMap(Map<String, String> inputMap, String key) {
        inputMap.remove(key);
    }

    @Override
    protected int countUniqueWordsInList(List<String> inputWords) {
        Map map = new HashMap<String, String>();
        for (var word : inputWords) {
         map.put(word, word);
        }
        return map.keySet().size();
    }

}
