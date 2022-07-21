import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gioco {
    Color tastiColor = Color.DARK_GRAY;
    Color Rosso = Color.RED;
    Color Verde = Color.GREEN;
    int ActualPlayer=1;

    ImageIcon croce = new ImageIcon("croce.jpg"); 
    JLabel croce0= new JLabel(croce);
    JLabel croce1= new JLabel(croce);
    JLabel croce2= new JLabel(croce);
    JLabel croce3= new JLabel(croce);
    JLabel croce4= new JLabel(croce);
    JLabel croce5= new JLabel(croce);
    JLabel croce6= new JLabel(croce);
    JLabel croce7= new JLabel(croce);
    JLabel croce8= new JLabel(croce);
    JLabel croce9= new JLabel(croce);
    JLabel croci[] = {croce0,croce1,croce2,croce3,croce4,croce5,croce6,croce7,croce8,croce9};
    

    ImageIcon cerchio = new ImageIcon("cerchio.jpg");
    JLabel cerchio0 = new JLabel(cerchio);
    JLabel cerchio1 = new JLabel(cerchio);
    JLabel cerchio2 = new JLabel(cerchio);
    JLabel cerchio3 = new JLabel(cerchio);
    JLabel cerchio4 = new JLabel(cerchio);
    JLabel cerchio5 = new JLabel(cerchio);
    JLabel cerchio6 = new JLabel(cerchio);
    JLabel cerchio7 = new JLabel(cerchio);
    JLabel cerchio8 = new JLabel(cerchio);
    JLabel cerchio9 = new JLabel(cerchio);
    JLabel cerchi[]= {cerchio0,cerchio1,cerchio2,cerchio3,cerchio4,cerchio5,cerchio6,cerchio7,cerchio8,cerchio9};


    String tastost0=" ";
    String tastost1=" ";
    String tastost2=" ";
    String tastost3=" ";
    String tastost4=" ";
    String tastost5=" ";
    String tastost6=" ";
    String tastost7=" ";
    String tastost8=" ";
    String tastost9=" ";


    JFrame jf = new JFrame();
    JButton tasto0 = new JButton();
    JButton tasto1 = new JButton();
    JButton tasto2 = new JButton();
    JButton tasto3 = new JButton();
    JButton tasto4 = new JButton();
    JButton tasto5 = new JButton();
    JButton tasto6 = new JButton();
    JButton tasto7 = new JButton();
    JButton tasto8 = new JButton();
    JButton tasto9 = new JButton();
    JButton exit = new JButton("Exit");
    JButton reset = new JButton("Reset");
    JButton indietro = new JButton("Indietro");
    static JLabel sfondo = new JLabel();
    JLabel titolo =new JLabel("TIC TAC TOE");
    JLabel risultato =new JLabel();
    
    JLabel player1 =new JLabel("Player 1");
    JLabel player2 =new JLabel("Player 2");
    JLabel chigioca1= new JLabel();
    JLabel chigioca2= new JLabel();
    JLabel sinistra= new JLabel();
    JLabel destra= new JLabel();
    JLabel sotto= new JLabel();
    JButton tasti[] = {tasto0,tasto1,tasto2,tasto3,tasto4,tasto5,tasto6,tasto7,tasto8,tasto9};

    String il1 = "il";String il2 = "il"; 
    static String player1st = "Player1";static String player2st = "Player2";
    
    public gioco(String nome1,String nome2){ 
        player1st=nome1;
        player2st=nome2;
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
    
    public void costruzione(){
        sinistra.setBounds(0,0,30,700);
        sinistra.setOpaque(true);
        sinistra.setBackground(Color.red);
        jf.add( sinistra);

        destra.setBounds(435,0,30,700);
        destra.setOpaque(true);
        destra.setBackground(Color.red);
        jf.add(destra);

        

        titolo.setBounds(0,0,480,30);
    	titolo.setOpaque(true);
    	titolo.setBackground(Color.red);
    	titolo.setFont(new Font("Arial Bold",Font.BOLD,22));
    	titolo.setForeground(Color.BLACK);
    	titolo.setHorizontalAlignment(JLabel.CENTER);
    	jf.add(titolo);

        risultato.setBounds(0,553,480,60);
    	risultato.setOpaque(true);
    	risultato.setBackground(Color.red);
    	risultato.setFont(new Font("Arial Bold",Font.BOLD,25));
    	risultato.setForeground(Color.BLACK);
    	risultato.setHorizontalAlignment(JLabel.CENTER);
    	jf.add(risultato);

        tasto1.setBounds(115, 50, 75, 75);
        tasto1.setBackground(tastiColor);
        tasto1.addActionListener(new tastiimp());
        tasto1.setOpaque(true);
        jf.add(tasto1);

        tasto2.setBounds(200, 50, 75, 75);
        tasto2.setBackground(tastiColor);
        tasto2.addActionListener(new tastiimp());
        tasto2.setOpaque(true);
        jf.add(tasto2);

        tasto3.setBounds(285, 50, 75, 75);
        tasto3.setBackground(tastiColor);
        tasto3.addActionListener(new tastiimp());
        tasto3.setOpaque(true);
        jf.add(tasto3);

        tasto4.setBounds(115, 135, 75, 75);
        tasto4.setBackground(tastiColor);
        tasto4.addActionListener(new tastiimp());
        tasto4.setOpaque(true);
        jf.add(tasto4);

        tasto5.setBounds(200, 135, 75, 75);
        tasto5.setBackground(tastiColor);
        tasto5.setOpaque(true);
        tasto5.addActionListener(new tastiimp());
        jf.add(tasto5);

        tasto6.setBounds(285, 135, 75, 75);
        tasto6.setBackground(tastiColor);
        tasto6.setOpaque(true);
        tasto6.addActionListener(new tastiimp());
        jf.add(tasto6);

        tasto7.setBounds(115, 220, 75, 75);
        tasto7.setBackground(tastiColor);
        tasto7.setOpaque(true);
        tasto7.addActionListener(new tastiimp());
        jf.add(tasto7);

        tasto8.setBounds(200, 220, 75, 75);
        tasto8.setBackground(tastiColor);
        tasto8.setOpaque(true);
        tasto8.addActionListener(new tastiimp());
        jf.add(tasto8);

        tasto9.setBounds(285, 220, 75, 75);
        tasto9.setBackground(tastiColor);
        tasto9.setOpaque(true);
        tasto9.addActionListener(new tastiimp());
        jf.add(tasto9);

        



        player1.setBounds(100, 330, 125, 30);
        player1.setBackground(Color.red);
        player1.setForeground(Color.BLACK);
        player1.setText(player1st);
        player1.setOpaque(true);    
        player1.setFont(new Font("Arial Bold",Font.BOLD,18));
        player1.setHorizontalAlignment(JLabel.CENTER);
        jf.add(player1);

        chigioca1.setBounds(150, 380, 25, 25);
        chigioca1.setBackground(Color.GREEN);
        chigioca1.setOpaque(true);
        jf.add(chigioca1);

        player2.setBounds(250, 330, 125, 30);
        player2.setBackground(Color.red);
        player2.setText(player2st);
        player2.setForeground(Color.BLACK);
        player2.setOpaque(true);    
        player2.setFont(new Font("Arial Bold",Font.BOLD,18));
        player2.setHorizontalAlignment(JLabel.CENTER);
        jf.add(player2);

        chigioca2.setBounds(300, 380, 25, 25);
        chigioca2.setBackground(Color.RED);
        chigioca2.setOpaque(true);
        jf.add(chigioca2);

        exit.setBounds(100, 450, 125, 30);
        exit.setForeground(Color.white);
        exit.setBackground(tastiColor);
        exit.setOpaque(true);
        exit.setFont(new Font("Arial",Font.BOLD,18));
        exit.addActionListener(new tastiminoriAL());
        jf.add(exit);

        indietro.setBounds(175, 500, 125, 30);
        indietro.setForeground(Color.white);
        indietro.setBackground(tastiColor);
        indietro.setOpaque(true);
        indietro.setFont(new Font("Arial",Font.BOLD,18));
        indietro.addActionListener(new tastiminoriAL());
        jf.add(indietro);

        reset.setBounds(250, 450, 125, 30);
        reset.setForeground(Color.white);
        reset.setBackground(tastiColor);
        reset.setOpaque(true);
        reset.setFont(new Font("Arial",Font.BOLD,18));
        reset.addActionListener(new tastiminoriAL());
        jf.add(reset);

    }
    public void croce(int i){
        int x=0;int y=0;int wi=0;int he=0;
        tasti[i].setVisible(false);
        wi=tasti[i].getWidth();
        he=tasti[i].getHeight();
        x=tasti[i].getX();
        y=tasti[i].getY();
        costruzionecroci(x,y,wi,he,i);
        
    }
    public void costruzionecroci(int x,int y,int wi,int he,int i){
        controllo();
        croci[i].setBounds(x, y, wi, he);
        jf.add(croci[i]);
        chigioca1.setBackground(Rosso);
        chigioca2.setBackground(Verde);
        ActualPlayer=2;
        controllo();
    } 
    public void cerchio(int i){

        int x=0;int y=0;int wi=0;int he=0;
        tasti[i].setVisible(false);
        wi=tasti[i].getWidth();
        he=tasti[i].getHeight();
        x=tasti[i].getX();
        y=tasti[i].getY();
        costruzionecerchi(x,y,wi,he,i);

    }
    public void costruzionecerchi(int x,int y,int wi,int he,int i){
        controllo();
        cerchi[i].setBounds(x, y, wi, he);
        jf.add(cerchi[i]);
        chigioca1.setBackground(Verde);
        chigioca2.setBackground(Rosso);
        ActualPlayer=1;
        controllo();
    }
    public void output(){

        System.out.print(tastost1);
        System.out.print(tastost2);
        System.out.print(tastost3);
        System.out.println();
        System.out.print(tastost4);
        System.out.print(tastost5);
        System.out.print(tastost6);
        System.out.println();
        System.out.print(tastost7);
        System.out.print(tastost8);
        System.out.print(tastost9);


    }
    public void controllo(){
        controlloo();
        controllox();

    }
    public void controllox(){
        if(tastost1=="x"&&tastost2=="x"&&tastost3=="x"){
            risultato.setText("Vince:"+player1st);
            for(int i=4;i<=9;i++){
                tasti[i].setVisible(false);
                cerchi[i].setVisible(false);
                croci[i].setVisible(false);
            }
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
        else if (tastost4=="x"&&tastost5=="x"&&tastost6=="x"){
            risultato.setText("Vince:"+player1st);
            for(int i=1;i<=9;i++){
                if(i==4){
                    i=i+3;
                }
                tasti[i].setVisible(false);
                cerchi[i].setVisible(false);
                croci[i].setVisible(false);
            }
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
        else if(tastost7=="x"&&tastost8=="x"&&tastost9=="x"){
            risultato.setText("Vince:"+player1st);
            for(int i=1;i<=6;i++){
                tasti[i].setVisible(false);
                cerchi[i].setVisible(false);
                croci[i].setVisible(false);
            }
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
        else if(tastost1=="x"&&tastost5=="x"&&tastost9=="x"){
            risultato.setText("Vince:"+player1st);
            tasto2.setVisible(false);tasto3.setVisible(false);tasto4.setVisible(false);tasto6.setVisible(false);tasto7.setVisible(false);tasto8.setVisible(false);
            cerchio2.setVisible(false);cerchio3.setVisible(false);cerchio4.setVisible(false);cerchio6.setVisible(false);cerchio7.setVisible(false);cerchio8.setVisible(false);
            croce2.setVisible(false);croce3.setVisible(false);croce4.setVisible(false);croce6.setVisible(false);croce7.setVisible(false);croce8.setVisible(false);
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }else if(tastost3=="x"&&tastost5=="x"&&tastost7=="x"){
            risultato.setText("Vince:"+player1st);
            tasto1.setVisible(false);tasto2.setVisible(false);tasto4.setVisible(false);tasto6.setVisible(false);tasto7.setVisible(false);tasto8.setVisible(false);tasto9.setVisible(false);
            cerchio1.setVisible(false);cerchio2.setVisible(false);cerchio4.setVisible(false);cerchio6.setVisible(false);cerchio8.setVisible(false);cerchio9.setVisible(false);
            croce1.setVisible(false);croce2.setVisible(false);croce4.setVisible(false);croce6.setVisible(false);croce8.setVisible(false);croce9.setVisible(false);
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
        else if(tastost1=="x"&&tastost4=="x"&&tastost7=="x"){
            risultato.setText("Vince:"+player1st);
            tasto2.setVisible(false);tasto3.setVisible(false);tasto4.setVisible(false);tasto5.setVisible(false);tasto6.setVisible(false);tasto8.setVisible(false);tasto9.setVisible(false);
            cerchio2.setVisible(false);cerchio3.setVisible(false);cerchio5.setVisible(false);cerchio6.setVisible(false);cerchio8.setVisible(false);cerchio9.setVisible(false);
            croce2.setVisible(false);croce3.setVisible(false);croce5.setVisible(false);croce6.setVisible(false);croce8.setVisible(false);croce9.setVisible(false);
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
        else if(tastost2=="x"&&tastost5=="x"&&tastost8=="x"){
            risultato.setText("Vince:"+player1st);
            tasto1.setVisible(false);tasto4.setVisible(false);tasto7.setVisible(false);tasto3.setVisible(false);tasto6.setVisible(false);tasto9.setVisible(false);
            cerchio1.setVisible(false);cerchio4.setVisible(false);cerchio7.setVisible(false);cerchio3.setVisible(false);cerchio6.setVisible(false);cerchio9.setVisible(false);
            croce1.setVisible(false);croce4.setVisible(false);croce7.setVisible(false);croce3.setVisible(false);croce6.setVisible(false);croce9.setVisible(false);
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }else if(tastost3=="x"&&tastost6=="x"&&tastost9=="x"){
            risultato.setText("Vince:"+player1st);
            tasto1.setVisible(false);tasto4.setVisible(false);tasto7.setVisible(false);tasto2.setVisible(false);tasto5.setVisible(false);tasto8.setVisible(false);tasto9.setVisible(false);
            cerchio1.setVisible(false);cerchio4.setVisible(false);cerchio7.setVisible(false);cerchio2.setVisible(false);cerchio5.setVisible(false);cerchio8.setVisible(false);cerchio9.setVisible(false);
            croce2.setVisible(false);croce4.setVisible(false);croce7.setVisible(false);croce2.setVisible(false);croce5.setVisible(false);croce8.setVisible(false);
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
    }
    public void controlloo(){
        if(tastost1=="o"&&tastost2=="o"&&tastost3=="o"){
            risultato.setText("Vince:"+player2st);
            for(int i=4;i<=9;i++){
                tasti[i].setVisible(false);
                cerchi[i].setVisible(false);
                croci[i].setVisible(false);
            }
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);   
        }
        else if (tastost4=="o"&&tastost5=="o"&&tastost6=="o"){
            risultato.setText("Vince:"+player2st);
            for(int i=1;i<=9;i++){
                if(i==4){
                    i=i+3;
                }
                tasti[i].setVisible(false);
                cerchi[i].setVisible(false);
                croci[i].setVisible(false);
            }
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
        else if(tastost7=="o"&&tastost8=="o"&&tastost9=="o"){
            risultato.setText("Vince:"+player2st);
            for(int i=1;i<=6;i++){
                tasti[i].setVisible(false);
                cerchi[i].setVisible(false);
                croci[i].setVisible(false);
            }
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
        else if(tastost1=="o"&&tastost5=="o"&&tastost9=="o"){
            risultato.setText("Vince:"+player2st);
            tasto2.setVisible(false);tasto3.setVisible(false);tasto4.setVisible(false);tasto6.setVisible(false);tasto7.setVisible(false);tasto8.setVisible(false);
            cerchio2.setVisible(false);cerchio3.setVisible(false);cerchio4.setVisible(false);cerchio6.setVisible(false);cerchio7.setVisible(false);cerchio8.setVisible(false);
            croce2.setVisible(false);croce3.setVisible(false);croce4.setVisible(false);croce6.setVisible(false);croce7.setVisible(false);croce8.setVisible(false);
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }else if(tastost3=="o"&&tastost5=="o"&&tastost7=="o"){
            risultato.setText("Vince:"+player2st);
            tasto1.setVisible(false);tasto2.setVisible(false);tasto4.setVisible(false);tasto6.setVisible(false);tasto7.setVisible(false);tasto8.setVisible(false);tasto9.setVisible(false);
            cerchio1.setVisible(false);cerchio2.setVisible(false);cerchio4.setVisible(false);cerchio6.setVisible(false);cerchio8.setVisible(false);cerchio9.setVisible(false);
            croce1.setVisible(false);croce2.setVisible(false);croce4.setVisible(false);croce6.setVisible(false);croce8.setVisible(false);croce9.setVisible(false);
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
        else if(tastost1=="o"&&tastost4=="o"&&tastost7=="o"){
            risultato.setText("Vince:"+player2st);
            tasto2.setVisible(false);tasto3.setVisible(false);tasto4.setVisible(false);tasto5.setVisible(false);tasto6.setVisible(false);tasto8.setVisible(false);tasto9.setVisible(false);
            cerchio2.setVisible(false);cerchio3.setVisible(false);cerchio5.setVisible(false);cerchio6.setVisible(false);cerchio8.setVisible(false);cerchio9.setVisible(false);
            croce2.setVisible(false);croce3.setVisible(false);croce5.setVisible(false);croce6.setVisible(false);croce8.setVisible(false);croce9.setVisible(false);
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
        else if(tastost2=="o"&&tastost5=="o"&&tastost8=="o"){
            risultato.setText("Vince:"+player2st);
            tasto1.setVisible(false);tasto4.setVisible(false);tasto7.setVisible(false);tasto3.setVisible(false);tasto6.setVisible(false);tasto9.setVisible(false);
            cerchio1.setVisible(false);cerchio4.setVisible(false);cerchio7.setVisible(false);cerchio3.setVisible(false);cerchio6.setVisible(false);cerchio9.setVisible(false);
            croce1.setVisible(false);croce4.setVisible(false);croce7.setVisible(false);croce3.setVisible(false);croce6.setVisible(false);croce9.setVisible(false);
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }else if(tastost3=="o"&&tastost6=="o"&&tastost9=="o"){
            risultato.setText("Vince:"+player2st);
            tasto1.setVisible(false);tasto4.setVisible(false);tasto7.setVisible(false);tasto2.setVisible(false);tasto5.setVisible(false);tasto8.setVisible(false);tasto9.setVisible(false);
            cerchio1.setVisible(false);cerchio4.setVisible(false);cerchio7.setVisible(false);cerchio2.setVisible(false);cerchio5.setVisible(false);cerchio8.setVisible(false);cerchio9.setVisible(false);
            croce2.setVisible(false);croce4.setVisible(false);croce7.setVisible(false);croce2.setVisible(false);croce5.setVisible(false);croce8.setVisible(false);
            player1.setVisible(false);player2.setVisible(false);chigioca1.setVisible(false);chigioca2.setVisible(false);
        }
    }
   public static void main(String[] args) {
        new gioco(player1st,player2st);
    }

    class tastiminoriAL implements ActionListener{
    	
    	public void actionPerformed(ActionEvent ev){
            Object ob =ev.getSource();

            if(ob==exit){
                jf.dispose();
                output();
            }
            if(ob==reset){
                jf.dispose();
                new gioco(player1st,player2st);
            }   
            if(ob==indietro){
                jf.dispose();
                new index();
            }
            }
            
        }
    class tastiimp implements ActionListener{
    	
        public void actionPerformed(ActionEvent ev){
            Object ob =ev.getSource();
            if(ob==tasto1){
                if(ActualPlayer==1){
                    tastost1="x";
                    croce(1);
                   
                }
                else{
                    tastost1="o";
                    cerchio(1);
                    
                }

            }
            if(ob==tasto2){
                if(ActualPlayer==1){
                    tastost2="x";
                    croce(2);
                    
                }
                else{
                    tastost2="o";
                    cerchio(2);
                    
                }
                
            }
            if(ob==tasto3){
                if(ActualPlayer==1){
                    tastost3="x";
                    croce(3);
                    
                }
                else{
                    tastost3="o";
                    cerchio(3);
                    
                }
                
            }
            if(ob==tasto4){
                if(ActualPlayer==1){
                    tastost4="x";
                    croce(4);
                    
                }
                else{
                    tastost4="o";
                    cerchio(4);
                    
                    
                }
                
            }
            if(ob==tasto5){
                if(ActualPlayer==1){
                    tastost5="x";
                    croce(5);
                    
                }
                else{
                    tastost5="o";
                    cerchio(5);
                    
                }
                
            }
            if(ob==tasto6){
                if(ActualPlayer==1){
                    tastost6="x";
                    croce(6);
                    
                }
                else{
                    tastost6="o";
                    cerchio(6);
                    
                }
                
            }
            if(ob==tasto7){
                if(ActualPlayer==1){
                    tastost7="x";
                    croce(7);
                    
                }
                else{
                    tastost7="o";
                    cerchio(7);
                    
                }

                
            }
            if(ob==tasto8){
                if(ActualPlayer==1){
                    tastost8="x";
                    croce(8);
                    
                }
                else{
                    tastost8="o";
                    cerchio(8);
                    
                }
                
            }
            if(ob==tasto9){
                if(ActualPlayer==1){
                    tastost9="x";
                    croce(9);
                    
                }
                else{
                    tastost9="o";
                    cerchio(9);
                    
                }
                
            }
        }   

    }

}
      
    



