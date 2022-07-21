import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class index {
    JLabel player1= new JLabel("Primo player");
    JLabel player2= new JLabel("Secondo player");
    JTextField nome1= new JTextField();
    JTextField nome2= new JTextField();
    JLabel titolo= new JLabel("Tic Tac Toe");
    JLabel sinistra= new JLabel();
    JLabel destra= new JLabel();
    JLabel sotto= new JLabel();
    ImageIcon tictactoe = new ImageIcon("tictactoe.jpg");
    JLabel img = new JLabel(tictactoe);
    JFrame jf= new JFrame();
    JButton gioca= new JButton("Gioca");
    JButton regole= new JButton("Regole");
    JButton exit = new JButton("Esci");
    Color tastiColor = Color.DARK_GRAY;
    String nome1st="";String nome2st="";






    
    public index(){
        
        jf.setLayout(null);
        jf.setBounds(1200, 100, 480, 700);
        jf.setDefaultCloseOperation(3);
        jf.setResizable(false);
        //jf.setUndecorated(true);
        Container c = jf.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);
       
        costruzione();    




        jf.setVisible(true);
    }
   private void costruzione() {

        titolo.setBounds(0,0,480,30);
        titolo.setOpaque(true);
        titolo.setBackground(Color.red);
        titolo.setFont(new Font("Arial Bold",Font.BOLD,22));
        titolo.setForeground(Color.BLACK);
        titolo.setHorizontalAlignment(JLabel.CENTER);
        jf.add(titolo);

        sinistra.setBounds(0,0,30,700);
        sinistra.setOpaque(true);
        sinistra.setBackground(Color.red);
        jf.add( sinistra);

        destra.setBounds(435,0,30,700);
        destra.setOpaque(true);
        destra.setBackground(Color.red);
        jf.add(destra);

        sotto.setBounds(0,632,480,30);
        sotto.setOpaque(true);
        sotto.setBackground(Color.red);
        jf.add(sotto);
        
        img.setBounds(80, 30, 300, 300);
        img.setVisible(true);
        jf.add(img);
        
        player1.setBounds(80, 330, 125, 30);
        player1.setBackground(Color.red);
        player1.setForeground(Color.BLACK);
        player1.setOpaque(true);    
        player1.setFont(new Font("Arial Bold",Font.BOLD,14));
        player1.setHorizontalAlignment(JLabel.CENTER);
        jf.add(player1);

        player2.setBounds(255, 330, 125, 30);
        player2.setBackground(Color.red);
        player2.setForeground(Color.BLACK);
        player2.setOpaque(true);    
        player2.setFont(new Font("Arial Bold",Font.BOLD,14));
        player2.setHorizontalAlignment(JLabel.CENTER);
        jf.add(player2);

        nome1.setBounds(80, 380, 125, 30);
        nome1.setBackground(Color.red);
        nome1.setForeground(Color.BLACK);
        nome1.setOpaque(true);    
        nome1.setFont(new Font("Arial Bold",Font.BOLD,18));
        nome1.setHorizontalAlignment(JLabel.CENTER);
        jf.add(nome1);

        nome2.setBounds(255, 380, 125, 30);
        nome2.setBackground(Color.red);
        nome2.setForeground(Color.BLACK);
        nome2.setOpaque(true);    
        nome2.setFont(new Font("Arial Bold",Font.BOLD,18));
        nome2.setHorizontalAlignment(JLabel.CENTER);
        jf.add(nome2);

        exit.setBounds(180, 450, 100, 30);
        exit.setForeground(Color.white);
        exit.setBackground(tastiColor);
        exit.setOpaque(true);
        exit.setFont(new Font("Arial",Font.BOLD,18));
        exit.addActionListener(new tastiminoriAL());
        jf.add(exit);

        gioca.setBounds(180, 500, 100, 30);
        gioca.setForeground(Color.white);
        gioca.setBackground(tastiColor);
        gioca.setOpaque(true);
        gioca.setFont(new Font("Arial",Font.BOLD,18));
        gioca.addActionListener(new tastiminoriAL());
        jf.add(gioca);

        regole.setBounds(180, 550, 100, 30);
        regole.setForeground(Color.white);
        regole.setBackground(tastiColor);
        regole.setOpaque(true);
        regole.setFont(new Font("Arial",Font.BOLD,18));
        regole.addActionListener(new tastiminoriAL());
        jf.add(regole);

    }
    public void stringhe(){
        nome1st=nome1.getText();
        nome2st=nome2.getText();

    }
public static void main(String[] args) {
    new index();

    }
    class tastiminoriAL implements ActionListener{
    	
    	public void actionPerformed(ActionEvent ev){
            Object ob =ev.getSource();

            if(ob==exit){
                jf.dispose();
            }
            if(ob==gioca){
                jf.dispose();
                stringhe();
                new gioco(nome1st,nome2st);
            }
            if(ob==regole){
                jf.dispose();
                new regole();
            }     

            }
            
        }
       

}

