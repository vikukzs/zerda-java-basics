import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Card> used = new ArrayList<>();
    ArrayList<String> colorList = new ArrayList<>(Arrays.asList("kor", "karo", "treff", "pikk"));



    public Deck() {
        Random r = new Random();
        String randColor = colorList.get(r.nextInt(colorList.size()));

        for (int i = 0; i < 53; i++) {
            cards.add(new Card(randColor));
        }
    }

}
