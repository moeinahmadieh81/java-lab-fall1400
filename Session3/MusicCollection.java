package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The type Music collection.
 */
public class MusicCollection {
    private ArrayList<Music> Songs = new ArrayList<>();
    private ArrayList<Music> favorite = new ArrayList<>();
    private MusicPlayer player;

    /**
     * Instantiates a new Music collection.
     */
    public MusicCollection() {
        Songs = new ArrayList<Music>();
        favorite = new ArrayList<Music>();
        player = new MusicPlayer();
    }

    /**
     * Add song.
     *
     * @param song the song
     */
    public void addSong(Music song) {
        Songs.add(song);
    }

    /**
     * Remove song.
     *
     * @param index the index
     */
    public void removeSong(int index) {
        if (validIndex(index)) {
            Songs.remove(index);
        } else {
            System.out.println("Index is not valid");
        }
    }

    /**
     * Gets number of files.
     *
     * @return the number of files
     */
    public int getNumberOfFiles() {
        return Songs.size();
    }

    /**
     * Print list.
     *
     * @param index the index
     */
    public void printList(int index) {
        if (validIndex(index)) {
            for (int i = 0; i < index; i++) {
                System.out.println(Songs.get(i).getName());
                System.out.println(Songs.get(i).getSinger());
                System.out.println(Songs.get(i).getYear());
            }
        } else {
            System.out.println("Index is not valid");
        }
    }

    /**
     * Print all list.
     */
    public void printAllList() {
           if (Songs.size() == 0){
               System.out.println("your list is empty");
           }else{
               for(int i = 0; i < Songs.size(); i++){
                   System.out.println("Music name: " + Songs.get(i).getName());
                   System.out.println("Singer name: " + Songs.get(i).getSinger());
                   System.out.println("The year music released : " + Songs.get(i).getYear());
               }
           }
    }

    /**
     * Add favorite.
     *
     * @param song the song
     */
    public void addFavorite(Music song) {
        favorite.add(song);
    }

    /**
     * Remove favorite.
     *
     * @param index the index
     */
    public void removeFavorite(int index) {
        if (validIndex(index)) {
            favorite.remove(index);
        } else {
            System.out.println("Index is not valid");
        }
    }

    /**
     * Print favorites.
     */
    public void printFavorites() {
        Iterator<Music> it = favorite.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * Start playing.
     *
     * @param index the index
     */
    public void startPlaying(int index) {
        if (validIndex(index)) {
            player.startPlaying(Songs.get(index).getName());
        } else {
            System.out.println("Index is not valid");
        }
    }

    /**
     * Stop playing.
     */
    public void stopPlaying() {
        player.stop();
    }

    private boolean validIndex(int index) {
        if (index > Songs.size()) {
            return false;
        }
        return true;
    }

}