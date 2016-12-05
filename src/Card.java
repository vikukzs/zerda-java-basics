
/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class Card {
    String color;
    int value;
    boolean played = false;

    public boolean isPlayed() {
        return true;
    }

    public Card(String color) {
        this.color = color;
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
