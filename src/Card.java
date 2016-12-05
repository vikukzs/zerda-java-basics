/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class Card {
    String color;
    int value;

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
