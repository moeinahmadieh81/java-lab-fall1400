package com.company;

import java.util.Scanner;

public class RunMusic {
    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection country = new MusicCollection();
        MusicCollection favorite  = new MusicCollection();

        Music m1 = new Music("Ed Sheeran","Shape of you","2014");
        Music m2 = new Music("Halsey", "Without me", "2015");
        Music m3 = new Music("Taylor Swift","Blank Sspace","2016");
        Music m4 = new Music("Adele", "Easy on Me", "2020");
        Music m5 = new Music("One direction","YOU & I", " 2012");
        pop.addSong(m1);
        pop.addSong(m4);
        country.addSong(m3);
        jazz.addSong(m2);
        rock.addSong(m5);
        pop.getNumberOfFiles();
        pop.printAllList();
        favorite.addFavorite(m1);
        favorite.addFavorite(m2);
        favorite.startPlaying(1);
        favorite.stopPlaying();
        favorite.addFavorite(m5);
        favorite.getNumberOfFiles();
        favorite.printFavorites();
        pop.removeSong(1);
        pop.getNumberOfFiles();
        pop.printAllList();
    }
}
