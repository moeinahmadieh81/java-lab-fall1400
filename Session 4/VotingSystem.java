package com.company;

import java.util.ArrayList;

/**
 * The type Voting system.
 */
public class VotingSystem {
    private ArrayList<Voting> votingList = new ArrayList<Voting>();

    /**
     * Instantiates a new Voting system.
     *
     */
    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }

    /**
     * Create voting.
     *
     * @param q      the q
     * @param t      the t
     * @param choice the choice
     */
    public void createVoting(String q, int t, ArrayList<String> choice) {
        Voting v = new Voting(t, q);
        votingList.add(v);
        for (int i = 0; i < choice.size(); i++) {
            v.createChoice(choice.get(i));
        }
    }

    /**
     * Vote.
     *
     * @param t      the t
     * @param person the person
     * @param votes  the votes
     */
    public void vote(int t, Person person, ArrayList<String> votes){
        votingList.get(t).vote(person, votes);
    }

    /**
     * Print all question.
     */
    public void printAllQuestion() {
        for (int i = 0; i < votingList.size(); i++) {
            System.out.println(votingList.get(i).getQuestion());
        }
    }

    /**
     * Print voting.
     *
     * @param t the t
     */
    public void printVoting(int t) {
        System.out.println(votingList.get(t).getQuestion());
        for (int i = 0; i < votingList.get(t).getPolls().size(); i++) {
            System.out.println(votingList.get(t).getPolls().get(i));
        }
    }


    /**
     * Print result.
     *
     * @param t the t
     */
    public void printResult(int t) {
        votingList.get(t).printVotes();
    }
}
