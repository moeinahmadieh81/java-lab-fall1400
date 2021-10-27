package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.Objects;

/**
 * The type Vote.
 */
public class Vote {
    private Person person;
    private String date;
    /**
     * The Jalali calendar.
     */
    JalaliCalendar jalaliCalendar = new JalaliCalendar();

    /**
     * Instantiates a new Vote.
     *
     * @param person the person
     */
    public Vote(Person person) {
        this.person = person;
        this.date = jalaliCalendar.getDayOfWeekString();
    }

    /**
     * Gets person.
     *
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person) && Objects.equals(date, vote.date) && Objects.equals(jalaliCalendar, vote.jalaliCalendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, date, jalaliCalendar);
    }
}
