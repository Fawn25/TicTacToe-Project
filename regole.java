import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class regole {
    JFrame jf = new JFrame();
    JLabel titolo= new JLabel("Regole Tic Tac Toe");
    JLabel sinistra= new JLabel();
    JLabel destra= new JLabel();
    JLabel sotto= new JLabel();
    JButton exit = new JButton("Esci");
    JButton indietro = new JButton("Indietro");
    Color tastiColor = Color.DARK_GRAY;
    JLabel riga1= new JLabel("Vince il giocatore che riesce a");
    JLabel riga2= new JLabel("disporre tre dei propri simboli in linea");
    JLabel riga3= new JLabel("retta, orizzontale, verticale o diagonale.");
    JLabel riga4= new JLabel("Se la griglia viene riempita senza che");
    JLabel riga5= new JLabel("nessuno dei giocatori sia riuscito");
    JLabel riga6= new JLabel("a completare una linea di tre simboli,");
    JLabel riga7= new JLabel("il gioco finisce in parità.");
    
    
    public regole(){
        jf.setLayout(null);
        jf.setBounds(1200, 100, 480, 650);
        jf.setDefaultCloseOperation(3);
        jf.setResizable(false);
        //jf.setUndecorated(true);
        jf.setBackground(Color.darkGray);
        Container c = jf.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);
        
        costruzione();


        jf.setVisible(true);
    }
    private void costruzione() {

        riga1.setBounds(30,45,480,30);
        riga1.setHorizontalAlignment(JLabel.LEFT);
        riga1.setFont(new Font("Arial Bold",Font.BOLD,22));
        jf.add(riga1);
        riga2.setBounds(30,85,480,30);
        riga2.setHorizontalAlignment(JLabel.LEFT);
        riga2.setFont(new Font("Arial Bold",Font.BOLD,22));
        jf.add(riga2);
        riga3.setBounds(30,125,480,30);
        riga3.setHorizontalAlignment(JLabel.LEFT);
        riga3.setFont(new Font("Arial Bold",Font.BOLD,22));
        jf.add(riga3);
        riga4.setBounds(30,165,480,30);
        riga4.setHorizontalAlignment(JLabel.LEFT);
        riga4.setFont(new Font("Arial Bold",Font.BOLD,22));
        jf.add(riga4);  
        riga5.setBounds(30,205,480,30);
        riga5.setHorizontalAlignment(JLabel.LEFT);
        riga5.setFont(new Font("Arial Bold",Font.BOLD,22));
        jf.add(riga5);
        riga6.setBounds(30,245,480,30);
        riga6.setHorizontalAlignment(JLabel.LEFT);
        riga6.setFont(new Font("Arial Bold",Font.BOLD,22));
        jf.add(riga6);
        riga7.setBounds(30,285,480,30);
        riga7.setHorizontalAlignment(JLabel.LEFT);
        riga7.setFont(new Font("Arial Bold",Font.BOLD,22));
        jf.add(riga7);

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

        sotto.setBounds(0,583,480,30);
        sotto.setOpaque(true);
        sotto.setBackground(Color.red);
        jf.add(sotto);
        
        

        exit.setBounds(175, 450, 130, 30);
        exit.setForeground(Color.white);
        exit.setBackground(tastiColor);
        exit.setOpaque(true);
        exit.setFont(new Font("Arial",Font.BOLD,18));
        exit.addActionListener(new tastiminoriAL());
        jf.add(exit);

        indietro.setBounds(175, 500, 130, 30);
        indietro.setForeground(Color.white);
        indietro.setBackground(tastiColor);
        indietro.setOpaque(true);
        indietro.setFont(new Font("Arial",Font.BOLD,18));
        indietro.addActionListener(new tastiminoriAL());
        jf.add(indietro);


        

    }



    public static void main(String[] args) {
      new regole();  
    }

    class tastiminoriAL implements ActionListener{
    	
    	public void actionPerformed(ActionEvent ev){
            Object ob =ev.getSource();

            if(ob==exit){
                jf.dispose();
            }
            if(ob==indietro){
                jf.dispose();
                new index();
            }     

            }
            
        }


}
