
import javax.swing.*;

public class Tester {
    public static void main(String[] args) {
        JFrame frame = new JFrame("my first GUI");
        LifeMatrix mat = new LifeMatrix(10);

        DrawMatrix panel = new DrawMatrix();
        frame.setSize(700,700);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        frame.repaint();


        frame.setVisible(true);

    }


}
