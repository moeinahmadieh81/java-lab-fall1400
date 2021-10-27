package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * The type Voting.
 */
public class Voting {
    private int type;
    private String question;
    /**
     * The Voters.
     */
    ArrayList<Person> voters = new ArrayList<Person>();
    private HashMap<String, HashSet<Vote>> polls;


    /**
     * Instantiates a new Voting.
     *
     * @param type     the type
     * @param question the question
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<Person>();
        polls = new HashMap<String, HashSet<Vote>>();
    }

    /**
     * Gets question.
     *
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Create choice.
     *
     * @param choice the choice
     */
    public void createChoice(String choice) {
        polls.put(choice, new HashSet<Vote>());
    }

    /**
     * Vote.
     *
     * @param p the p
     * @param v the v
     */
    public void vote(Person p, ArrayList<String> v) {
        if (v.get(0).equals("random")) {
            Random r = new Random();
            int t = r.nextInt(getPolls().size());
            v.remove(0);
            v.add(getPolls().get(t));

        }
        voters.add(p);
        if (type == 1 && v.size() > 1) {
            System.out.println("please choose your choice");
        } else {
            Vote vote = new Vote(p);
            for (int i = 0; i < v.size(); i++) {
                for (String key : polls.keySet()) {
                    if (v.get(i).equals(key)) {
                        polls.get(key).add(vote);
                    }
                }
            }
        }
    }


    /**
     * Gets voters.
     */
    public void getVoters() {
        for (int i = 0; i < voters.size(); i++) {
            System.out.println(voters.get(i).toString());
        }
    }

    /**
     * Print votes.
     */
    public void printVotes() {
        for (int i = 0; i < getPolls().size(); i++) {
            System.out.print(getPolls().get(i) + " = " + polls.get(getPolls().get(i)).size() + " ( ");
            for (Vote obj : polls.get(getPolls().get(i))) {
                System.out.print(obj.getPerson().toString() + " voted in " + obj.getDate() + ", ");
            }
            System.out.println(")");
        }
    }

    /**
     * Gets polls.
     *
     * @return the polls
     */
    public ArrayList<String> getPolls() {
        ArrayList<String> a = new ArrayList<String>();
        for (String key : polls.keySet()) {
            a.add(key);
        }
        return a;
    }
}
