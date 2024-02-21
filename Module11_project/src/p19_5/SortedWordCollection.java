package p19_5;

import java.util.LinkedList;

public class SortedWordCollection implements WordCollectionADT {
    private final LinkedList<String>[] wordLists;

    @SuppressWarnings("unchecked")
    public SortedWordCollection() {
        wordLists = (LinkedList<String>[]) new LinkedList<?>[26];
        for (int i = 0; i < wordLists.length; i++) {
            wordLists[i] = new LinkedList<>();
        }
    }

    @Override
    public void add(String word) {
        if (word == null || word.isEmpty()) return;

        int index = Character.toLowerCase(word.charAt(0)) - 'a';
        LinkedList<String> list = wordLists[index];

        int insertIndex = 0;
        for (String currentWord : list) {
            if (currentWord.compareToIgnoreCase(word) >= 0) {
                break;
            }
            insertIndex++;
        }
        list.add(insertIndex, word);
    }

    @Override
    public boolean contains(String word) {
        if (word == null || word.isEmpty()) return false;

        int index = Character.toLowerCase(word.charAt(0)) - 'a';
        LinkedList<String> list = wordLists[index];
        return list.contains(word);
    }
}

