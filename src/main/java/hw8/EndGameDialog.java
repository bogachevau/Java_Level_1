package hw8;

import javax.swing.*;
import java.awt.*;

public class EndGameDialog extends JFrame {

    private static final ImageIcon WIN = new ImageIcon("win.png");
    private static final ImageIcon LOSS = new ImageIcon("loss.png");

    public EndGameDialog() throws HeadlessException{
        setSize(300,300);
        JPanel panel = new JPanel();
        if (GameXO.checkVictory(GameXO.ICON_X)){
            panel.add(new JLabel(WIN));
        } else {
            panel.add(new JLabel(LOSS));
        }
        JButton repeat = new JButton("Повторить");
        JButton exit = new JButton("Выход");
        repeat.addActionListener(a -> {
            new GameXO();
            dispose();
        });
        exit.addActionListener(a -> dispose());
        panel.add(repeat);
        panel.add(exit);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }



}
