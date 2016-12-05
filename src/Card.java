import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class Card {
    String color;
    int value;


    public Card(String color) {

        this.color = color;
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
