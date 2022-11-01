/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dhima
 */
public class No5BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        No5Bank bank1 = new No5Bank(1000000);
        bank1.Simpanuang(500000);
        bank1.Ambilsaldo();
        
        bank1.Ambiluang(2000000);
        bank1.Ambiluang(300000);
    }
    
}
