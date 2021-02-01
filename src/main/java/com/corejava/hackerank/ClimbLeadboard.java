package com.corejava.hackerank;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */
public class ClimbLeadboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        int rankedSize = ranked.size();
        List<Integer> rankingSequence = new ArrayList<>();
        int rank = 0;
        for(int i = 0;i < ranked.size();i++) {
            if(i == 0) {
                rankingSequence.add(++rank);
            } else if (i > 0) {
                if (ranked.get(i-1) != ranked.get(i)) {
                    rankingSequence.add(++rank);
                } else {
                    rankingSequence.add(rank);
                }
            }
        }
        //System.out.println(rankingSequence);
        List<Integer> trackings = new ArrayList<>();
        for(int i=0;i < player.size(); i++) {
            for(int j=ranked.size()-1;j >= 0;j--) {
                if(player.get(i) > ranked.get(j)) {
                    if(player.get(i) > ranked.get(0)) {
                        trackings.add(1);
                        break;
                    }
                    continue;
                } else if(player.get(i) == ranked.get(j)) {
                    trackings.add(rankingSequence.get(j));
                    break;
                } else {
                    if(player.get(i) < ranked.get(ranked.size() - 1)) {
                        trackings.add(rankingSequence.get(ranked.size() - 1) + 1);
                    } else {
                        trackings.add(rankingSequence.get(j+1));
                    }
                    break;

                }

            }
        }
        //System.out.println(trackings);

        return trackings;
    }

    public static void main(String[] args) {
        climbingLeaderboard(List.of(100, 100, 50, 40, 40, 20, 10) , List.of(5, 25, 50, 120));
    }

}
