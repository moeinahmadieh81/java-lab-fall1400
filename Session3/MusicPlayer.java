package com.company;

/**
 * The type Music player.
 */
public class MusicPlayer {

    private boolean isPlaying;

    /**
     * Instantiates a new Music player.
     */
    public MusicPlayer() {
        isPlaying = false;
    }


    /**
     * Start playing.
     *
     * @param filename the filename
     */
    public void startPlaying(String filename) {
        if (filename.equals("NULL")) {
            System.out.println("Wrong Input");
        } else {
            System.out.println(filename + " is playing...");
            isPlaying = true;
        }
    }

    /**
     * Stop.
     */
    public void stop() {
        System.out.println("player is stopped!");
        isPlaying = false;
    }


}
