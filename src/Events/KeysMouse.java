package Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.Key;

public class KeysMouse extends JFrame implements MouseListener, KeyListener{
    JLabel label1;
    KeysMouse() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Working with Key and Mouse Listeners");
        this.setSize(500, 500);
        this.setLayout(null);
        setVisible(true);
        label1 = new JLabel();
        label1.setSize(100, 100);
        label1.setBackground(Color.BLUE);
        label1.setOpaque(true);
        add(label1);

        this.addKeyListener(this); //we call for the class
        this.addMouseListener(this);
        ImageIcon icon = new ImageIcon("icon.png");
        JFrame frame = new JFrame();
        frame.setIconImage(icon.getImage());
        frame.setSize(50,50);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key code: " + e.getKeyCode());

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key code: " + e.getKeyCode());
        switch(e.getKeyCode()){
            case 37:
                label1.setLocation(label1.getX()-10,label1.getY());
                break;
            case 38:
                label1.setLocation(label1.getX(), label1.getY()-10);
                break;
            case 39:
                label1.setLocation(label1.getX()+10, label1.getY());
                break;
            case 40:
                label1.setLocation(label1.getX(), label1.getY()+10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label1.setLocation(e.getXOnScreen(), e.getYOnScreen());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label1.setLocation(e.getXOnScreen(), e.getYOnScreen());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label1.setLocation(e.getXOnScreen(), e.getYOnScreen());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label1.setBackground(Color.GREEN);
        System.out.println("x" + e.getX());
        System.out.println("y" +e.getY());
        label1.setLocation(e.getXOnScreen(), e.getYOnScreen());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label1.setBackground(Color.BLUE);
        label1.setLocation(e.getXOnScreen(), e.getYOnScreen());
    }

    public static void main(String[] args) {
        new KeysMouse();
    }
}