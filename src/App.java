import javax.swing.*;
import java.awt.*;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class App extends JFrame {
    Toolkit tk = Toolkit.getDefaultToolkit();

    public App() {
        this.add(new BlackJack());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }

}
