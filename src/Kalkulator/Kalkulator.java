/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

/**
 *
 * @author RSA
 *   HARI/TANGGAL : Kamis, 7 Februari 2019

NO SOAL : 6

KELAS : IF8

NIM : 10110269

NAMA : RIZKI ADAM KURNIAWAN
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    private double value1,value2,hasil;
    public void setValue1(double value1){
        this.value1 = value1;
    }

    public void setValue2(double value2){
        this.value2 = value2;
    }
    public void setHasil(double hasil){
        hasil= value1 * value2;
        this.hasil = hasil;
    }

    // ini method getter
    public double getValue1(){
        return this.value1;
    }

    public double getValue2(){
        return this.value2;
    }
    public double getHasil(){
        hasil = value1 * value2;
        return this.hasil;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator reka = new Kalkulator();
        double value1,value2,hasil;
        reka.setValue1(7.0);
        reka.setValue2(5.0);
        System.out.println("Value 1 = "+ reka.getValue1());
        System.out.println("Value 2 = "+ reka.getValue2());
        System.out.println("Hasil Perkalian = "+reka.getHasil());
        
    }
    
}
