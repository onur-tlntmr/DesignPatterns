/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Onur
 */
public class Program {
    public static void main(String[] args) {

        String[] audi_istek = {"Sanroof","Navigasyon","Akıllı Asistan"};
        String[] bmw_istek = {"Çelik Cant","ESP"};
        Musteri.ArabaIstegi(Markalar.AUDI, "A4", audi_istek);
        Musteri.ArabaIstegi(Markalar.BMW, "3.20", bmw_istek);
    }
}
