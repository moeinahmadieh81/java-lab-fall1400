package com.company;


/**
 * The type Music.
 */
public class Music {
    private String singer;
    private String Year;
    private String name;

    /**
     * Instantiates a new Music.
     *
     * @param singer the singer
     * @param name   the name
     * @param Year   the year
     */
    public Music(String singer, String name, String Year) {
        this.singer = singer;
        this.name = name;
        this.Year = Year;
    }

    /**
     * Gets singer.
     *
     * @return the singer
     */
    public String getSinger() {
        return singer;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets singer.
     *
     * @param singer the singer
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets year.
     *
     * @return the year
     */
    public String getYear() {
        return Year;
    }
}
