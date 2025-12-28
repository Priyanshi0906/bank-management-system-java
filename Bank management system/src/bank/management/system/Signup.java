package bank.management.system;


import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class Signup extends JFrame implements ActionListener  {
   JTextField textName , textfname ,textEmail,textAddress,textCity, textPinCode, textState ;
   JDateChooser dateChooser; 
   JRadioButton r1,r2,m1,m2;
   JButton Next;

  
    Random ran=new Random();
    long first4=(ran.nextLong()% 9000L)+1000L;
    String first = " " + Math.abs(first4);

    Signup(){
        

        super ("APLICATION FORM");
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1=new JLabel("APPLICATION FORM NO:"+ first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        add(label1);


        JLabel label2=new JLabel("PAGE NO 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);


        JLabel label3=new JLabel("PESONAL DETAILS");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);


        JLabel labelname=new JLabel("Name:");
        labelname.setBounds(100,190,100,30);
        labelname.setFont(new Font("Ralewal",Font.BOLD,20));
        add(labelname);


        textName = new JTextField();
        textName.setBounds(300,190,400,30);
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        add(textName);

        JLabel labelFname=new JLabel("Father's Name:");
        labelFname.setBounds(100,240,200,30);
        labelFname.setFont(new Font("Ralewal",Font.BOLD,20));
        add(labelFname);


        textfname= new JTextField();
        textfname.setBounds(300,240,400,30);
        textfname.setFont(new Font("Raleway",Font.BOLD,14));
        add(textfname);


        JLabel DOB=new JLabel("Date Of Birth:");
        DOB.setBounds(100,340,200,30);
        DOB.setFont(new Font("Ralewal",Font.BOLD,20));
        add(DOB);


        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setBounds(100,290,200,30);
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelG);

        r1= new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);


        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelemail=new JLabel("Email");
        labelemail.setFont(new Font("Raleway",Font.BOLD,20));
        labelemail.setBounds(100,390,200,30);
        add(labelemail);


        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);


        JLabel labelMs=new JLabel("Marital Status");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1= new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add( m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        add( m2);


        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);


        JLabel labelAdd=new JLabel("Address");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);


        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway",Font.BOLD,14));
        textAddress.setBounds(300,490,400,30);
        add(textAddress);


        JLabel labelCy=new JLabel("City");
        labelCy.setFont(new Font("Raleway",Font.BOLD,20));
        labelCy.setBounds(100,540,200,30);
        add(labelCy);


        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);


        JLabel labelPincode=new JLabel("Pin Code");
         labelPincode.setFont(new Font("Raleway",Font.BOLD,20));
         labelPincode.setBounds(100,590,200,30);
        add( labelPincode);


        textPinCode = new JTextField();
         textPinCode .setFont(new Font("Raleway",Font.BOLD,14));
         textPinCode .setBounds(300,590,400,30);
        add( textPinCode );


        JLabel labelState=new JLabel("State");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add( labelState);


        textState = new JTextField();
        textState .setFont(new Font("Raleway",Font.BOLD,14));
        textState .setBounds(300,640,400,30);
        add(  textState );

        Next=new JButton("Next");
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        Next.setFont(new Font("Raleway",Font.BOLD,14));
        Next.setBounds(620,710,80,30);
        Next.addActionListener(this);
        add(Next);


        getContentPane().setBackground(new Color (222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name = textName.getText();
        String fname= textfname.getText();
        String dob = ((JTextField) dateChooser .getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }
        else if(r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        }
        else if(m2.isSelected()){
            marital = "Unmarried";
        }
        String Address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPinCode.getText();
        String State = textState.getText();

        try{
            if(textName.getText().equals("")||textfname.getText().equals("")||textEmail.getText().equals("")||textAddress.getText().equals("")||textState.getText().equals("")||textCity.getText().equals("")||textPinCode.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }
            else{
                Conn con1 = new Conn();
                String sql = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+gender+"','"+dob+"','"+email+"','"+marital+"','"+Address+"','"+city+"','"+pincode+"','"+State+"')";
                con1.statement.executeUpdate(sql);
                new Signup2(formno);
                setVisible(false);

            }
        }
        catch(Exception E){
           E.printStackTrace();
        } 
    
        
    }

    

  public static void main(String[] args) {
    new Signup();

    }
    
}
