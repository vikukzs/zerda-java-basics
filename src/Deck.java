import java.util.ArrayList;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    ArrayList<Card> used = new ArrayList<>();


    public Deck() {
        for (int i = 0; i < 53; i++) {
            cards.add(new Card());
        }
    }



}
