package lesson11;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        String[] stringArray = new String[]{
                "\n", "я", "люблю", "тебя", "девчонка",
                "\n", "чистой", "искренней", "любовью",
                "\n", "всё", "к", "ногам", "твоим", "девчонка",
                "\n", "к", "твоему", "всё", "изголовью",
                "\n", "только", "денег", "малова-то",
                "\n", "а", "вернее", "денег", "нету",
                "\n", "ни", "на", "плитку", "шоколада",
                "\n", "ни", "на", "малую", "конфету.", "А", "вокруг...",
                "\n", "сникерсы", "сникерсы", "сникерсы", "-", "уикерсы",
                "\n", "баунти", "баунти", "баунти", "-", "уяунти",
                "\n", "йогурты", "йогурты", "йогурты", "-", "уёгурты",
                "\n", "лёгкие", "воздушные", "йогурты", "\n"
        };
        System.out.println(Arrays.toString(stringArray).replace(',',' '));
        System.out.println();

        ArrayList<String> songList = new ArrayList<String>(Arrays.asList(stringArray));
        HashMap<String, Integer> wordsCounter = new HashMap<String, Integer>();

        for (String words : songList) {
            if (wordsCounter.containsKey(words)) {
                wordsCounter.put(words, wordsCounter.get(words) + 1);
            } else {
                wordsCounter.put(words, 1);
            }
        }
        System.out.println(wordsCounter.toString());
        System.out.println();


        Set<String> exclusiveWords = new LinkedHashSet<String>(songList);
        System.out.println(exclusiveWords);
        System.out.println();


    }
}
