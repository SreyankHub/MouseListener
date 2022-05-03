import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Frame extends JFrame implements MouseListener {

    JLabel label;

    Frame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.GREEN);
        label.setOpaque(true);

        this.addMouseListener(this);
        this.add(label);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setLocation(getMousePosition());
        System.out.println("What Are You Doing?");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Go Away From This Area!! Now!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Thank You!!");
    }
}
