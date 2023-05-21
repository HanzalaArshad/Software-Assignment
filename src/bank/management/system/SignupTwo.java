
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    JTextField pan,cnic;
   JButton next;
   JRadioButton eyes,eno;
   JComboBox religion,category,occupation,education,income;
   String formno;
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        setTitle ("NEW ACCOUNT APLLICATION FORM-PAGE 2");
        
        
       
        JLabel additionalDetails =new JLabel("PAGE 2: ADDITIONAL DETAILS");
       additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
       additionalDetails.setBounds(290,80,400,30);
       add(additionalDetails);
       
        
        JLabel name =new JLabel("RELIGION: ");
       name.setFont(new Font("Raleway",Font.BOLD,20));
       name.setBounds(100,140,200,30);
       add(name);
       
       
       String valReligion[]={"MUSLIM","HINDU","CHRISTIAN","OTHER"};
       religion=new JComboBox( valReligion);
       religion.setBounds(300,140,400,30);
       religion.setBackground(Color.white);
       add(religion);
       
  
      
       
          JLabel FName =new JLabel("CATEGORY: ");
       FName.setFont(new Font("Raleway",Font.BOLD,20));
       FName.setBounds(100,190,200,30);
       add(FName);
       
       String valcategory[]={"GREEN LABEL","YELLOW LABEL","ORANGE LABEL","WHITE LABEL"};
       category=new JComboBox(valcategory);
       category.setBounds(300,190,400,30);
       add(category);
       
       
       
       
       
        JLabel dob =new JLabel("INCOME: ");
       dob.setFont(new Font("Raleway",Font.BOLD,20));
       dob.setBounds(100,240,200,30);
       add(dob);
        String incomecategory []={"NULL","< 1,50,000","< 2,50,000","< 5,00,000","up to 10,00,000"};
  
       income =new JComboBox(incomecategory);
       income.setBounds(300,240,400,30);
       add( income);
       
      

       JLabel gender =new JLabel("EDUCATIONAL ");
       gender.setFont(new Font("Raleway",Font.BOLD,20));
       gender.setBounds(100,290,200,30);
       add(gender);
      
        JLabel email =new JLabel("QULAIFICATION: ");
       email.setFont(new Font("Raleway",Font.BOLD,20));
       email.setBounds(100,315,200,30);
       add(email);
        
       String educationValues[]={"NON GRADUATION","GRADUATE","< POST-GRADUATION","DOCTRATE","OTHER"};
  
       education=new JComboBox(educationValues);
       education.setBounds(300,315,400,30);
       add( education);
       
//       
//        emailTextField = new JTextField();
//       emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
//       emailTextField.setBounds(300,340,400,30);
//       add(emailTextField);
//       
       
       
       JLabel marital =new JLabel("OCCUPATION: ");
       marital.setFont(new Font("Raleway",Font.BOLD,20));
       marital.setBounds(100,390,200,30);
       add(marital);
          
          
       String occupationvalues[]={"SELF-EMPLOYED","BUSINESSMAN","STUDENT","SALRIED","OTHER"};
  
      occupation=new JComboBox(occupationvalues);
      occupation.setBounds(300,390,400,30);
       add( occupation);
       
//       married =new JRadioButton("");
//       married.setBounds(300,390,100,30);
//       married.setBackground(Color.cyan);
//       add(married);
//       
//       unmarried =new JRadioButton("UNMARRIED");
//       unmarried.setBounds(450,390,100,30);
//       unmarried.setBackground(Color.cyan);
//       add(unmarried );
//       
//        other =new JRadioButton("OTHER");
//       other.setBounds(630,390,100,30);
//      other.setBackground(Color.cyan);
//       add(other);
//       
//       ButtonGroup maritalgroup =new ButtonGroup();
//       maritalgroup.add(married);
//       maritalgroup.add(unmarried);
//       maritalgroup.add(other);
       
       
       JLabel address =new JLabel("PAN NUMBER: ");
       address.setFont(new Font("Raleway",Font.BOLD,20));
       address.setBounds(100,440,200,30);
       add(address);
       
       pan = new JTextField();
       pan .setFont(new Font("Raleway",Font.BOLD,14));
      pan .setBounds(300,440,400,30);
       add(pan );
       
       
       JLabel city =new JLabel("CINIC : ");
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100,490,200,30);
       add(city);
       
         cnic = new JTextField();
         cnic.setFont(new Font("Raleway",Font.BOLD,14));
         cnic.setBounds(300,490,400,30);
         add( cnic);
       
       
       JLabel pin =new JLabel("EXISTING ACCOUNT" );
       pin.setFont(new Font("Raleway",Font.BOLD,20));
       pin.setBounds(100,540,200,30);
       add(pin);
       
       eyes =new JRadioButton("ACCOUNT EXIST");
       eyes.setBounds(300,540,100,30);
       eyes.setBackground(Color.cyan);
       add(eyes);
       
        eno =new JRadioButton("NOT EXIST");
        eno.setBounds(450,540,100,30);
        eno.setBackground(Color.cyan);
        add(eno );
       

       
       ButtonGroup egroup =new ButtonGroup();
       egroup.add(eyes);
       egroup.add(eno);
      
//       
//       pinTextField = new JTextField();
//       pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
//       pinTextField.setBounds(300,590,400,30);
//       add(pinTextField);
//       
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
   
    String sreligion=(String) religion.getSelectedItem();
    String scategory=(String)  category.getSelectedItem();
    String sincome=(String)  income.getSelectedItem();
    String seducation=(String)  education.getSelectedItem();
    String soccupation=(String)  occupation.getSelectedItem();
    String existingaccount=null;
    
    if(eyes.isSelected()){
        existingaccount="YES";
    }
    else if(eno.isSelected()){
         existingaccount="NO";
    }
  String span=pan.getText();
  String scnic=cnic.getText();
  
  try{
          conn c=new conn();
          String query ="insert into signuptwo values(' "+formno+"' ,'"+sreligion+"', '"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+scnic+"','"+existingaccount+"')";
          
         c.s.executeUpdate(query);
         //singuo3 object
          setVisible(false);
          new SignupThree(formno).setVisible(true);
  }
  catch(Exception e){
      System.out.println(e);
  }
}


    public static void main(String args []){
        new SignupTwo("");
    }
}

    

