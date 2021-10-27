package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Person voter = new Person("Ali", "ahmady");
        Person voter1 = new Person("reza", "mortazavi");
        ArrayList<String> option = new ArrayList<String>();
        ArrayList<String> days = new ArrayList<String>();
        option.add("yes");
        option.add("no");
        days.add("Sunday");
        days.add("Monday");
        days.add("Thursday");
        votingSystem.createVoting("Do you come ?", 1, option);
        votingSystem.createVoting("Wich day?", 0, days);
        System.out.println("print voting question");
        votingSystem.printAllQuestion();
        System.out.println("print first voting ");
        votingSystem.printVoting(0);
        ArrayList<String> option1 = new ArrayList<String>();
        ArrayList<String> option2 = new ArrayList<String>();
        ArrayList<String> days1 = new ArrayList<String>();
        option1.add("yes");
        option2.add("random");
        days1.add("Sunday");
        days1.add("Monday");
        votingSystem.vote(0, voter, option1);
        votingSystem.vote(0, voter1, option2);
        votingSystem.printVoting(1);
        votingSystem.vote(1, voter, days1);
        votingSystem.vote(1, voter1, days1);
        System.out.println("Result 1 :");
        votingSystem.printResult(0);
        System.out.println("Result 2 :");
        votingSystem.printResult(1);

    }
}
