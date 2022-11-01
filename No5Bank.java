/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dhima
 */
public class No5Bank {
 int Saldosaya;
    int total;
    public No5Bank(int saldo){
        Saldosaya = saldo;
    }
    void Ambilsaldo(){
        System.out.println("Selamat Datang  di Bank ABC");
        System.out.println("Saldo saat ini : "+Saldosaya);
        System.out.println("*****************************");
    }
    void Simpanuang(int Simpan){
        Saldosaya += Simpan;
        
        System.out.println("Simpan Uang : "+Simpan);
        System.out.println("saldo saat ini : "+Saldosaya);
        System.out.println("*****************************");
        
    }
    void Ambiluang(int ambil){
        if(ambil < Saldosaya){
            Saldosaya -= ambil;
            System.out.println("Ambil uang : "+ambil);
            System.out.println("saldo saat ini : "+"Rp."+Saldosaya);
            System.out.println("*****************************");
        }    else{
                    System.out.println("Maaf , Saldo anda Kurang");
        } 
        }
    }
                    

    
    

