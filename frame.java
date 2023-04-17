import javax.swing.*;  
import java.awt.event.*;  
import java.util.Random;


    public class frame implements ActionListener{  

        JFrame f=new JFrame();//creating instance of JFrame  
        JLabel l1;
        JTextField t1;
        JProgressBar jb; 

        Random rand = new Random();
        int numberTotal=0;
        int randInt = rand.nextInt(10);

        frame(){
        l1 = new JLabel("Please enter in a number 1-100");  
        l1.setBounds(100,50,200, 40);  

        t1=new JTextField("");  
        t1.setBounds(100,100, 200,30);  
        f.add(t1);

        JButton b=new JButton("Enter");//creating instance of JButton  
        b.setBounds(150,150,100, 40);//x axis, y axis, width, height  
                
        f.add(b);//adding button in JFrame  
        f.add(l1);
                
        f.setSize(400,300);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible     
              
        jb=new JProgressBar(0,101);    
        jb.setBounds(120,200,160,30);         
        jb.setValue(numberTotal);    
        jb.setStringPainted(true);    
        f.add(jb);     
        
        b.addActionListener(this);  

        }
        public static void main(String[] args) {  
            frame f = new frame();
            f.printFirstVal();
        }
        
        public void printFirstVal(){
            System.out.println(randInt);
        }

        public void actionPerformed(ActionEvent e) {  
            String s1 = t1.getText();  
            try {
                int a=Integer.parseInt(s1);
                System.out.println(a);
                checkNum(a);
            }   
            catch(NumberFormatException nfe){
                System.out.println("Please enter in a number");
            }
        } 

        public void setRand(){
            int min = 1;
            int max = 100 - numberTotal;
            randInt = (int) (Math.random()*(max-min+1)+min);   
            System.out.println(randInt);
        }
        
        public void checkNum(int numberCheck){
            if (numberCheck == randInt) {
                numberTotal += numberCheck;
                jb.setValue(numberTotal);
                setRand();
            }
        }

    }
