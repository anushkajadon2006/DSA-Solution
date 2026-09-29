import javax.swing.*;

public class Registrationform {
    public static void main(String[] args) {

        JFrame f1 = new JFrame("Registration Form");
        f1.setSize(500, 600);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ===== LABELS =====
        JLabel lid = new JLabel("Id:");
        JLabel lname = new JLabel("Name:");
        JLabel lage = new JLabel("Age:");
        JLabel lemail = new JLabel("Email:");
        JLabel lcity = new JLabel("City:");
        JLabel lgender = new JLabel("Gender:");
        JLabel lperformance = new JLabel("Performance:");

        lid.setBounds(50, 50, 100, 30);
        lname.setBounds(50, 90, 100, 30);
        lage.setBounds(50, 130, 100, 30);
        lemail.setBounds(50, 170, 100, 30);
        lcity.setBounds(50, 210, 100, 30);
        lgender.setBounds(50, 250, 100, 30);
        lperformance.setBounds(50, 300, 100, 30);

        // ===== TEXT FIELDS =====
        JTextField tid = new JTextField();
        JTextField tname = new JTextField();
        JTextField tage = new JTextField();
        JTextField temail = new JTextField();

        tid.setBounds(180, 50, 200, 30);
        tname.setBounds(180, 90, 200, 30);
        tage.setBounds(180, 130, 200, 30);
        temail.setBounds(180, 170, 200, 30);

        // ===== COMBO BOX =====
        String cities[] = {"Select City", "Gwalior", "Bhopal", "Indore"};
        JComboBox<String> cityBox = new JComboBox<>(cities);
        cityBox.setBounds(180, 210, 200, 30);

        // ===== GENDER RADIO BUTTON =====
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        male.setBounds(180, 250, 80, 30);
        female.setBounds(270, 250, 100, 30);

        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(male);
        bgGender.add(female);

        // ===== PERFORMANCE RADIO BUTTON =====
        JRadioButton talkative = new JRadioButton("Talkative");
        JRadioButton shy = new JRadioButton("Shy");

        talkative.setBounds(180, 300, 100, 30);
        shy.setBounds(290, 300, 80, 30);

        ButtonGroup bgPerformance = new ButtonGroup();
        bgPerformance.add(talkative);
        bgPerformance.add(shy);

        // ===== BUTTONS =====
        JButton submit = new JButton("Submit");
        JButton exit = new JButton("Exit");

        submit.setBounds(120, 380, 100, 40);
        exit.setBounds(250, 380, 100, 40);

        // ===== ADD TO FRAME =====
        f1.add(lid); f1.add(tid);
        f1.add(lname); f1.add(tname);
        f1.add(lage); f1.add(tage);
        f1.add(lemail); f1.add(temail);
        f1.add(lcity); f1.add(cityBox);
        f1.add(lgender); f1.add(male); f1.add(female);
        f1.add(lperformance); f1.add(talkative); f1.add(shy);
        f1.add(submit); f1.add(exit);
    }
}
