
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField , FNameTextField, emailTextField ,addressTextField,cityTextField,stateTextField,pinTextField;
   JButton next;
   JRadioButton male,female,married,unmarried,other;
   JDateChooser dateChooser;
   
    SignupOne(){
        setLayout(null);
         setTitle ("NEW ACCOUNT APLLICATION FORM-PAGE 1");
        
        Random ran=new Random();
       long random = Math.abs((ran.nextLong()% 9000L )+ 1000L);
       
        JLabel formno=new JLabel("APPLICATION FORM NO :"+random);
       formno.setFont(new Font("Raleway",Font.BOLD,38));
       formno.setBounds(140,20,600,40);
       add(formno);
       
        JLabel personDetails =new JLabel("PAGE 1: PERSONAL DETAILS");
       personDetails.setFont(new Font("Raleway",Font.BOLD,22));
       personDetails.setBounds(290,80,400,30);
       add(personDetails);
       
        
        JLabel name =new JLabel("NAME: ");
       name.setFont(new Font("Raleway",Font.BOLD,20));
       name.setBounds(100,140,200,30);
       add(name);
       
        nameTextField = new JTextField();
       nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
       nameTextField.setBounds(300,140,400,30);
       add(nameTextField);
       
       
       
          JLabel FName =new JLabel("FATHER NAME: ");
       FName.setFont(new Font("Raleway",Font.BOLD,20));
       FName.setBounds(100,190,200,30);
       add(FName);
       
        FNameTextField = new JTextField();
       FNameTextField.setFont(new Font("Raleway",Font.BOLD,14));
       FNameTextField.setBounds(300,190,400,30);
       add(FNameTextField);
       
       
       
       
        JLabel dob =new JLabel("DATE OF BIRTH: ");
       dob.setFont(new Font("Raleway",Font.BOLD,20));
       dob.setBounds(100,240,200,30);
       add(dob);
       
       dateChooser = new JDateChooser();
       dateChooser.setBounds(300,240,400,30);
       dateChooser.setForeground(new Color(105,105,105));
       add(dateChooser);
       

       JLabel gender =new JLabel("GENDER: ");
       gender.setFont(new Font("Raleway",Font.BOLD,20));
       gender.setBounds(100,290,200,30);
       add(gender);
      
        male =new JRadioButton("MALE");
       male.setBounds(300,290,60,30);
       male.setBackground(Color.gray);
       add(male);
       
       female =new JRadioButton("FEMALE");
       female.setBounds(450,290,120,30);
       female.setBackground(Color.gray);
       add(female);
       
       ButtonGroup gendergroup=new ButtonGroup();
       gendergroup.add(male);
       gendergroup.add(female);
       

       
       
   
       
       
       JLabel email =new JLabel("EMAIL ADDRESS: ");
       email.setFont(new Font("Raleway",Font.BOLD,20));
       email.setBounds(100,340,200,30);
       add(email);
       
        emailTextField = new JTextField();
       emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
       emailTextField.setBounds(300,340,400,30);
       add(emailTextField);
       
       
       
       JLabel marital =new JLabel("MARITAL STATUS: ");
       marital.setFont(new Font("Raleway",Font.BOLD,20));
       marital.setBounds(100,390,200,30);
       add(marital);
       
       married =new JRadioButton("MARRIED");
       married.setBounds(300,390,100,30);
       married.setBackground(Color.gray);
       add(married);
       
       unmarried =new JRadioButton("UNMARRIED");
       unmarried.setBounds(450,390,100,30);
       unmarried.setBackground(Color.gray);
       add(unmarried );
       
        other =new JRadioButton("OTHER");
       other.setBounds(630,390,100,30);
      other.setBackground(Color.gray);
       add(other);
       
       ButtonGroup maritalgroup =new ButtonGroup();
       maritalgroup.add(married);
       maritalgroup.add(unmarried);
       maritalgroup.add(other);
       
       
       JLabel address =new JLabel("ADDRESS: ");
       address.setFont(new Font("Raleway",Font.BOLD,20));
       address.setBounds(100,440,200,30);
       add(address);
       
       addressTextField = new JTextField();
       addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
       addressTextField.setBounds(300,440,400,30);
       add(addressTextField);
       
       
       JLabel city =new JLabel("CITY: ");
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100,490,200,30);
       add(city);
       
        cityTextField = new JTextField();
       cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
       cityTextField.setBounds(300,490,400,30);
       add(cityTextField);
       
       JLabel state =new JLabel("PROVINCE: ");
       state.setFont(new Font("Raleway",Font.BOLD,20));
       state.setBounds(100,540,200,30);
       add(state);
       
        stateTextField = new JTextField();
       stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
       stateTextField.setBounds(300,540,400,30);
       add(stateTextField);
       
       JLabel pin =new JLabel("PIN: ");
       pin.setFont(new Font("Raleway",Font.BOLD,20));
       pin.setBounds(100,590,200,30);
       add(pin);
       
       pinTextField = new JTextField();
       pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
       pinTextField.setBounds(300,590,400,30);
       add(pinTextField);
       
       next = new JButton("NEXT");
       next.setBackground(Color.black);
       next.setBackground(Color.white);
       next.setFont(new Font("Raleway",Font.BOLD,14));
       next.setBounds(620,660,80,30);
       next.addActionListener(this);
       add(next);     
       
       getContentPane().setBackground(Color.GRAY); 
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
public void actionPerformed(ActionEvent ae){
    String formno= ""+ random; //long
    String name=nameTextField.getText();
    String Fname=FNameTextField.getText();
    String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender=null;
    if(male.isSelected()){
        gender="MALE";
    }
    else if(female.isSelected()){
        gender="FEMALE";
    }
  String email= emailTextField.getText();
  String marital=null;
  if(married.isSelected()){
      marital = "Married";
      
  }
  else if(unmarried.isSelected()){
      marital="UnMarried";
  }
  else if(other.isSelected()){
      marital="other";
  }
  String address=addressTextField.getText();
  String city=cityTextField.getText();
  String state=stateTextField.getText();
  String pin=pinTextField.getText();
  try{
      if(name.equals("")){
          JOptionPane.showMessageDialog(null,"NAME IS REQUIRED");
          
          
      }
      else{
          conn c=new conn();
          String query ="insert into signup values(' "+formno+"' ,'"+name+"', '"+Fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
          c.s.executeUpdate(query);
          setVisible(false);
          new SignupTwo(formno).setVisible(true);
          
      }
  }
  catch(Exception e){
      System.out.println(e);
  }
}


    public static void main(String args []){
        new SignupOne();
    }
}
