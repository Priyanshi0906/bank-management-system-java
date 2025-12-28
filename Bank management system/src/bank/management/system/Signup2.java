package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Signup2 extends JFrame implements ActionListener{

    JComboBox Combobox,Combobox2,Combobox3,Combobox4,Combobox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,m1,m2;
    JButton next;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");

        this.formno = formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2= i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(105,5,100,100);
        add(image);

    

        JLabel L1=new JLabel("Page 2");
        L1.setFont(new Font("Raleway",Font.BOLD,22));
        L1.setBounds(300,30,600,40);
        add(L1);

        JLabel L2=new JLabel("Additional Details");
        L2.setFont(new Font("Raleway",Font.BOLD,22));
        L2.setBounds(300,60,600,40);
        add(L2);

        JLabel L3=new JLabel("Religion :");
        L3.setFont(new Font("Raleway",Font.BOLD,18));
        L3.setBounds(100,120,100,30);
        add(L3);


        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        Combobox = new JComboBox(religion);
        Combobox.setBackground(new Color(252,208,76));
        Combobox.setFont(new Font("Raleway",Font.BOLD,14));
        Combobox.setBounds(350,120,320,30);
        add(Combobox);


        JLabel L4=new JLabel("Category :");
        L4.setFont(new Font("Raleway",Font.BOLD,18));
        L4.setBounds(100,170,100,30);
        add(L4);


        String category[]={"General","OBC","SC","ST","Other"};
        Combobox2 = new JComboBox(category);
        Combobox2.setBackground(new Color(252,208,76));
        Combobox2.setFont(new Font("Raleway",Font.BOLD,14));
        Combobox2.setBounds(350,170,320,30);
        add(Combobox2);

        JLabel L5=new JLabel("Income :");
        L5.setFont(new Font("Raleway",Font.BOLD,18));
        L5.setBounds(100,220,100,30);
        add(L5);


        String income[]={"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        Combobox3 = new JComboBox(income);
        Combobox3.setBackground(new Color(252,208,76));
        Combobox3.setFont(new Font("Raleway",Font.BOLD,14));
        Combobox3.setBounds(350,220,320,30);
        add(Combobox3);


        JLabel L6=new JLabel("Education :");
        L6.setFont(new Font("Raleway",Font.BOLD,18));
        L6.setBounds(100,270,150,30);
        add(L6);


        String education[]={"Non_Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        Combobox4 = new JComboBox(education);
        Combobox4.setBackground(new Color(252,208,76));
        Combobox4.setFont(new Font("Raleway",Font.BOLD,14));
        Combobox4.setBounds(350,270,320,30);
        add(Combobox4);

        
        JLabel L7=new JLabel("Occupation:");
        L7.setFont(new Font("Raleway",Font.BOLD,18));
        L7.setBounds(100,320,150,30);
        add(L7);


        String occupation[]={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        Combobox5 = new JComboBox(occupation);
        Combobox5.setBackground(new Color(252,208,76));
        Combobox5.setFont(new Font("Raleway",Font.BOLD,14));
        Combobox5.setBounds(350,320,320,30);
        add(Combobox5);


        JLabel L8=new JLabel("PAN Number :");
        L8.setFont(new Font("Raleway",Font.BOLD,18));
        L8.setBounds(100,390,180,30);
        add(L8);

        textPan = new JTextField();
        textPan .setFont(new Font("Raleway",Font.BOLD,18));
        textPan .setBounds(350,390,320,30);
        add(textPan );


        JLabel L9=new JLabel("Aadhar Number :");
        L9.setFont(new Font("Raleway",Font.BOLD,18));
        L9.setBounds(100,440,180,30);
        add(L9);

        textAadhar = new JTextField();
        textAadhar .setFont(new Font("Raleway",Font.BOLD,18));
        textAadhar .setBounds(350,440,320,30);
        add(textAadhar );


        JLabel L10=new JLabel("Senior Citizen :");
        L10.setFont(new Font("Raleway",Font.BOLD,18));
        L10.setBounds(100,490,180,30);
        add(L10);

        
        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel L11=new JLabel("Existing Account :");
        L11.setFont(new Font("Raleway",Font.BOLD,18));
        L11.setBounds(100,540,180,30);
        add(L11);

        m1=new JRadioButton("Yes");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(252,208,76));
        m1.setBounds(350,540,100,30);
        add(m1);

        m2=new JRadioButton("No");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(252,208,76));
        m2.setBounds(460,540,100,30);
        add(m2);

        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);


        
        JLabel L12=new JLabel("Form No :");
        L12.setFont(new Font("Raleway",Font.BOLD,14));
        L12.setBounds(700,10,100,30);
        add(L12);

        
        JLabel L13=new JLabel(formno);
        L13.setFont(new Font("Raleway",Font.BOLD,14));
        L13.setBounds(760,10,60,30);
        add(L13);


        next=new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(570,640,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setUndecorated(true);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e){
        String rel = (String) Combobox.getSelectedItem();
        String cate = (String) Combobox2.getSelectedItem();
        String inc = (String) Combobox3.getSelectedItem();
        String edu = (String) Combobox4.getSelectedItem();
        String occ = (String) Combobox5.getSelectedItem();

            String pan = textPan.getText();
            String addhar = textAadhar.getText();

            String scitizen = "";
            if(r1.isSelected()){
                scitizen="Yes";
            }else if(r2.isSelected()){
                scitizen="No";
            }

            String eAccount = "";
            if(m1.isSelected()){
                eAccount="Yes";
            }else if(m2.isSelected()){
                eAccount="No";
            }


            try {
                if(textPan.getText().equals("")||textAadhar.getText().equals("")){
                    JOptionPane.showConfirmDialog(null, "Fill all the fields");
                }
                else{
                    Conn c1=new Conn();
                    String q = "insert into Signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                    
                    c1.statement.executeUpdate(q);
                    new Signup3(formno);
                    setVisible(false);


                }
                
            } catch (Exception E) {
                E.printStackTrace();
            }


    }

    public static void main(String[] args) {
        new Signup2("");
    }

}
