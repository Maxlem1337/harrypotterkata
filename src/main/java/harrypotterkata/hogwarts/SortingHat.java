package harrypotterkata.hogwarts;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class SortingHat {

    private static List<String> sentences = asList(
            "Hmm, who do we have here?",
            "Ah, I see, it's nameWizard",
            "Where shall we put you...",
            "Oh, I know...",
            "OK nameWizard, I'll put you in ...");

    private static String saySortingSentence(String wizardName, House house) {
       return sentences.get(new Random().nextInt(sentences.size()))
               .replace("nameWizard", wizardName)
               .concat(" " + house.toString());
    }

    public static House pickHouseFor(String wizardName) {
        House[] houses = House.values();
        House house = houses[new Random().nextInt(houses.length)];
        System.out.println(saySortingSentence(wizardName, house));
        return house;
    }
}
