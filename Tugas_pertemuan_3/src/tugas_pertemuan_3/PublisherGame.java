/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_3;

import java.io.Serializable;

/**
 *
 * @author Fadli Dwi
 */
public class PublisherGame implements Serializable {

    String Judul;
    double Harga;

    public PublisherGame(String Title, double Price) {
        this.Judul = Title;
        this.Harga = Price;
    }

    public String ToString() {
        return "\r\njudul game= " + Judul + "\r\n Harga game= " 
                + Harga + "\r\n";
    }
}
