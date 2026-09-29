import javax.swing.*;

public class one {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        f1.setVisible(true);
        f1.setSize(500, 600);
        JLabel l1 = new JLabel("Enter your Name :");
        f1.add(l1);
        f1.setLayout(null);
        l1.setBounds(200, 250, 100, 50);
        JTextField t1 = new JTextField();
        f1.add(t1);
        t1.setBounds(150, 300, 200, 30);
    }
}