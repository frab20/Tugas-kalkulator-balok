/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun3D;

import bangun2D.PersegiPanjang;

/**
 *
 * @author WXO
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{

    double tinggi;
    double luas,volume;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public String LuasPermukaan() {
        luas = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        return  "Luas permukaan balok= " + luas;
    }

    @Override
    public String Volume() {
        volume = getLuas()*tinggi;
        return  "Volume balok= " + volume;
    }
    
}
