import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class Card extends Deck {
    String color;
    int value;

    ArrayList<String> colorList = new ArrayList<>(Arrays.asList("kor", "karo", "treff", "pikk"));

    public Card(String color, int value) {
        Random r = new Random();
        String randColor = colorList.get(r.nextInt(colorList.size()));

        this.color = randColor;
        this.value = value;
    }

    public Card() {

    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return color + getValue();
    }
}
