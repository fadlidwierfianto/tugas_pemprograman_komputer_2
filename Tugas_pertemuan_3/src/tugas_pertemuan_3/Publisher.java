/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuan_3;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Fadli Dwi
 */
public class Publisher implements Serializable {

    private transient String ID;
    private static String publisher;
    private String Year;
    private List<PublisherGame> Games;

    public void setYear(String Year) {
        this.Year = Year;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setpublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGames(List<PublisherGame> Games) {
        this.Games = Games;
    }

    @Override
    public String toString() {
        String info, Game = "";
        info = "Informasi lengkap: \r\n"
                + "ID Publisher= " + ID + "\r\n"
                + "Nama publisher= " + publisher + "\r\n"
                + "Tahun pembuatan game= " + Year + "\r\n"
                + "=======================\r\n"
                + "Detail Product: \r\n";
        Game = Games.stream().map((obj)
                -> obj.toString()).reduce(Game, String::concat);
        return info + Game;
    }
}
