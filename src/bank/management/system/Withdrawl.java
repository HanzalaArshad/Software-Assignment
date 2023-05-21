package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    JButton withdrawl,back;
    JTextField amount;
    String pinnumber;
    
    Withdrawl(String pinnumber){
    this.pinnumber=pinnumber;
    
    setLayout(null);
    
    
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 =i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image =new JLabel(i3);
    image.setBounds(0,0,900,900);
    add (image);
    
    JLabel text=new JLabel("ENTER THE AMOUNT YOU WANT TO WITHDRAWL");
    text.setForeground(Color.white);
    text.setFont(new Font("system",Font.BOLD,14));
    text.setBounds(170,300,350,20);
    image.add(text);
    
    amount =new JTextField();
    amount.setFont(new Font("Raleway",Font.BOLD,22));
    amount.setBounds(170,350,320,20);
    image.add(amount);
    
    
    withdrawl=new JButton("WITHDRAW");
    withdrawl.setBounds(355,485,150,30);
    withdrawl.addActionListener(this);
    image.add(withdrawl);
    
    
    
    back=new JButton("BACK");
    back.setBounds(355,520,150,30);
    back.addActionListener(this);
    image.add(back);
    
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==withdrawl){
            String number=amount.getText();
            Date date =new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"PLEASE ENETER THE AMOUNT YOU WANT TO WITHDRAWL");
            }else {
                try{
                conn conn= new conn();
                String query ="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"RS"+number+" WITHDRAWED SUCCESSFULLY");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
                }
                catch(Exception e){
                    System.out.println(e);
                    
                }            
            }
        }else if(ae.getSource() == back){
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]){
        new Withdrawl("");
    }
}

