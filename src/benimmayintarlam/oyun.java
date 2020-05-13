package benimmayintarlam;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author Erol Berk Okuducu
 */
public class oyun extends mayinTarlasiOyunu{
    protected int kareSayisi=9;
    protected int mayin=10;
    JFrame frm=new JFrame("Oyun");
    public static void main(String [] args){
       
        oyun al=new oyun();
        al.ilkFrame();        
        
   }
    public void ilkFrame(){
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.getContentPane().add(new mayinYerlestirme(10,12).getContent());
      frm.setSize(550,450);
      frm.setLocation(300,100);
      frm.setVisible(true);
      JMenuBar menuBar=new JMenuBar();
      menuBar.setSize(550,100);
      oyunMenubar(menuBar);
      frm.setJMenuBar(menuBar);
      frm.repaint();
      frm.revalidate();
    }
    public void oyunMenubar(JMenuBar menuBar){
   
        JMenu dosya=new JMenu("Oyun");
        menuBar.add(dosya);
        JMenuItem yeniOyun=new JMenuItem("Yeni oyun");
        dosya.add(yeniOyun);
        JMenuItem baslangic=new JMenuItem("Baslangic");
        dosya.add(baslangic);
        JMenuItem orta=new JMenuItem("Orta");
        dosya.add(orta);
        JMenuItem zor=new JMenuItem("Zor");
        dosya.add(zor);
        JMenuItem cikis=new JMenuItem("Cıkıs");
        dosya.add(cikis);
        JMenuItem ozel=new JMenuItem("Ozel Oyun");
        dosya.add(ozel);
        
        cikis.addActionListener(new ActionListener() {
          
            @Override
             public void actionPerformed(ActionEvent e) {
               System.exit(0);                      
                  }
            }); 
    
yeniOyun.addActionListener(new ActionListener() {
            
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                 
                oyun al=new oyun();
                JFrame frm=new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(9,10).getContent());
                frm.setSize(550,450);
                frm.setLocation(300,100); 
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);
                al.frm=frm;
                  }
            }); 
            
        
        baslangic.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                oyun al=new oyun();
                JFrame frm=new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(9,10).getContent());
                frm.setSize(550,450);
                frm.setLocation(300,100);
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar); 
                al.frm=frm;
                  }
            }); 
        
        orta.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                oyun al=new oyun();
                JFrame frm=new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(16,40).getContent());
                frm.setSize(800,600);
                frm.setLocation(300,50);
                frm.setVisible(true);  
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);  
                al.frm=frm;
                  }
            }); 
        
        zor.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                oyun al=new oyun();
                JFrame frm=new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(22,99).getContent());
                frm.setSize(1070,650);
                frm.setLocation(200,30);
                frm.setVisible(true);  
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);   
                al.frm=frm;
                  }
           
            }); 
   ozel.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                oyun al=new oyun();
                JFrame frm=new JFrame("Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                new mayintarlası().setVisible(true);
               
          
       
           
                
              
                
    }
    
  
  
});
    }}
