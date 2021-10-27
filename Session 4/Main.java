package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Person voter = new  Person("Moein", "ahmadieh");
        Person voter1 = new Person("Alireza", "Zare");
        ArrayList<String> option = new ArrayList<String>();
        option.add("Samsung");
        option.add("Apple");
        option.add("Huawei");
        option.add("Xiaomi");
        option.add("Nokia");
        votingSystem.createVoting("Which phone is better", 0, option);
        System.out.println("print voting question");
        votingSystem.printAllQuestion();
        System.out.println("print first voting ");
        votingSystem.printVoting(0);
        ArrayList<String> option1 = new ArrayList<String>();
        ArrayList<String> option2 = new ArrayList<String>();
        option1.add("Apple");
        option1.add("Huawei");
        option1.add("Samsung");
        option2.add("random");
        option2.add("Samsung");
        option2.add("Apple");
        option2.add("Nokia");
        votingSystem.vote(0, voter, option1);
        votingSystem.vote(0, voter1, option2);
        votingSystem.printVoting(0);
        votingSystem.vote(0, voter, option1);
        votingSystem.vote(0, voter1, option2);
        System.out.println("Result 1 :");
        votingSystem.printResult(0);
        System.out.println("Result 2 :");
        votingSystem.printResult(0);
    }
}
