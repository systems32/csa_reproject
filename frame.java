import javax.swing.*;  
import java.awt.event.*;  

    public class frame implements ActionListener{  

        JFrame f=new JFrame();//creating instance of JFrame  
        JLabel l1;
        JTextField t1;
        JProgressBar jb; 
        int numberTotal=0;

        frame(){
        l1 = new JLabel("Please enter in a number 1-100");  
        l1.setBounds(100,50,200, 40);  

        JButton b=new JButton("clicker");//creating instance of JButton  
        b.setBounds(150,150,100, 40);//x axis, y axis, width, height  
                
        f.add(b);//adding button in JFrame  
        f.add(l1);
  
        t1=new JTextField("");  
        t1.setBounds(100,100, 200,30);  
        f.add(t1);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
                
        f.setSize(400,300);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  


           
              
        jb=new JProgressBar(0,100);    
        jb.setBounds(120,200,160,30);         
        jb.setValue(numberTotal);    
        jb.setStringPainted(true);    
        f.add(jb);    
        f.setLayout(null);    
        
        b.addActionListener(this);  

        }
        public static void main(String[] args) {  
            frame f = new frame();
            
        } 

        public void actionPerformed(ActionEvent e) {  
            String s1 = t1.getText();  
            try {
                int a=Integer.parseInt(s1);
                System.out.println(a);
                numberTotal += a;
                jb.setValue(numberTotal);
            }   
            catch(NumberFormatException nfe){
                System.out.println("Please enter in a number");
            }
        }  

        public void increase(int num) {
            if (num == 10) {
                System.out.println("works");
            }
        }

 
}  