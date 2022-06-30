import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Scanner;

public class bank implements ActionListener {

    JFrame newFrame = new JFrame();
    JFrame win = new JFrame(); // creates a new JFrame
    JPanel panel = new JPanel();  // creates a new JPanel
    JTextField text = new JTextField(); // creates a new JText field for displaying the balance
    JTextField request = new JTextField(10);
    JTextField request1 = new JTextField(10);
    ImageIcon deposit1 = new ImageIcon("deposit2.png");
    ImageIcon withdraw1 = new ImageIcon("withdraw2.png");
    ImageIcon balance1 = new ImageIcon("R2.png");
    JButton deposit = new JButton("deposit", deposit1); // creates buttons
    JButton depositing = new JButton("deposit", deposit1);
    JButton withdraw = new JButton("withdraw", withdraw1); //*
    JButton withdrawing = new JButton("withdraw", withdraw1);
    JButton balance = new JButton("balance", balance1); //*
    JButton cancel = new JButton("cancel");
    BorderLayout layout = new BorderLayout();
    FlowLayout lay = new FlowLayout();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel main = new JPanel();
    JLabel label = new JLabel("Enter the amount you depositing");
    JLabel label2 = new JLabel("Enter the amount you Withdrawing");
    operations op = new operations();
    String answer;



    public bank()
    {
        text.setEditable(false);
        win.setVisible(true);
        win.setTitle("Bank app");
        win.setSize(800, 500);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setContentPane(panel);
        panel.setLayout(layout);
        panel.add("North", text);
        panel.add("Center", deposit);
        panel.add("East", withdraw);
        panel.add("West", balance);
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        withdrawing.addActionListener(this);
        balance.addActionListener(this);
        depositing.addActionListener(this);
        text.setText(op.balance());
    }

    public void login()
    {



    }

    public static void main(String[] args)
    {
        new bank();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            if(e.getSource() == deposit)
            {
                request.setText("");
                request.setBounds(180,50, 150,20);
                panel2.setLayout(lay);
                panel2.add(label);
                panel2.add(request);
                panel2.add(depositing);
                newFrame.add(panel2);
                newFrame.setSize(600,300);
                newFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
                newFrame.setVisible(true);
                win.setVisible(false);
            }

           if(e.getSource() == depositing)
            {
              answer = request.getText();
              int Amount = Integer.parseInt(answer);
              op.Deposit(Amount);
              text.setText(op.balance());
              newFrame.remove(panel2);
              newFrame.setVisible(false);
              request.resetKeyboardActions();
              win.setVisible(true);
            }

           if(e.getSource() == withdraw)
             {

                 request.setText("");
                 request.setBounds(180,50, 150,20);
                 panel3.setLayout(lay);
                 panel3.add(label2);
                 panel3.add(request);
                 panel3.add(withdrawing);
                 newFrame.add(panel3);
                 newFrame.setSize(600,300);
                 newFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
                 newFrame.setVisible(true);
                 win.setVisible(false);
             }

            if (e.getSource() == withdrawing)
              {
                 answer = request.getText();
                 int Amount = Integer.parseInt(answer);
                 op.Withdaw(Amount);
                 text.setText(op.balance());
                 newFrame.remove(panel3);
                 newFrame.setVisible(false);
                 win.setVisible(true);
              }
    }
}





