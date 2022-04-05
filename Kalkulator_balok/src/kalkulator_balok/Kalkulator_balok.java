/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_balok;
import java.awt.event.*;
import javax.swing.*;
import bangun3D.Balok;
import java.util.InputMismatchException;

/**
 *
 * @author WXO
 */
public class Kalkulator_balok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI g = new GUI();
        
    }
    
}


class GUI extends JFrame implements ActionListener{
    JLabel lPanjang = new JLabel("panjang :");
    JTextField fPanjang = new JTextField(10);
    
    JLabel lLebar = new JLabel("Lebar :");
    JTextField fLebar = new JTextField(10);
    
    JLabel lTinggi = new JLabel("Tinggi :");
    JTextField fTinggi = new JTextField(10);
    
    JLabel lResult = new JLabel("Result :");
    JLabel rLuas = new JLabel("");
    JLabel rKeliling = new JLabel("");
    JLabel rVolume = new JLabel("");
    JLabel rluasP = new JLabel("");
    
    JButton bHitung = new JButton("Hitung");
    JButton bReset = new JButton("Reset");
    
    public GUI(){
        setTitle("Kalkulator balok");
        setSize(300,200);
        
        setLayout(null);
        add(lPanjang);
        add(fPanjang);
        add(lLebar);
        add(fLebar);
        add(lTinggi);
        add(fTinggi);
        add(lResult);
        add(rLuas);
        add(rKeliling);
        add(rVolume);
        add(rluasP);
        add(bHitung);
        add(bReset);
        
        lPanjang.setBounds(10, 10, 120, 20);
        fPanjang.setBounds(130, 10, 120, 20);
        
        lLebar.setBounds(10, 35, 120, 20);
        fLebar.setBounds(130, 35, 120, 20);
        
        lTinggi.setBounds(10, 65, 120, 20);
        fTinggi.setBounds(130, 65, 120, 20);
        
        lResult.setBounds(10, 95, 120, 20);
        rLuas.setBounds(10, 125, 200, 20);
        rKeliling.setBounds(10, 155, 200, 20);
        rVolume.setBounds(10, 185, 200, 20);
        rluasP.setBounds(10, 215, 200, 20);
        
        bHitung.setBounds(80, 245, 80, 20);
        bReset.setBounds(160, 245, 80, 20);
        
        setSize(300, 350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        bHitung.addActionListener(this);
        bReset.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bHitung){
            double p=0,l=0,t=0;
            try {
                p = Double.parseDouble(fPanjang.getText());
                l = Double.parseDouble(fLebar.getText());
                t = Double.parseDouble(fTinggi.getText());
            } catch (Exception error) {
                JOptionPane.showMessageDialog(this, error.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
            }finally{
                if(p!=0 || l!=0 || t!=0){
                    Balok balok1 = new Balok(p, l, t);
                    rLuas.setText(balok1.Luas());
                    rKeliling.setText(balok1.Keliling());
                    rVolume.setText(balok1.Volume());
                    rluasP.setText(balok1.LuasPermukaan()); 
                }    
            }
        }
        
        if(e.getSource() == bReset){
            fPanjang.setText("");
            fLebar.setText("");
            fTinggi.setText("");
            rKeliling.setText("");
            rLuas.setText("");
            rVolume.setText("");
            rluasP.setText("");
        } 
    }
}