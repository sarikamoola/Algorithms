package com.practice.algos;

import java.util.Scanner;

public class ElectionWinner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalVotes = in.nextInt();
		String[] listOfVoters = new String[totalVotes];
		for (int i = 0; i < totalVotes; i++) {
			listOfVoters[i] = in.next();
		}
		String[] candidate = new String[1];
		int temp = 0;
		for (int i = 0; i < listOfVoters.length; i++) {
			int vote = 1;
			String cacdvote = listOfVoters[i];
			for (int k = 0; k < listOfVoters.length; k++) {
				if (cacdvote.equals(listOfVoters[k]))
					vote++;
			}
			if (vote >= temp) {
				if (vote > temp) {
					candidate[0] = cacdvote;
				}
				temp = vote;
			}
		}
		for (int k = 0; k < candidate.length; k++) {
			if (!candidate[k].equals("")) {
				System.out.println(candidate[k]);
			}
		}
	}
}
