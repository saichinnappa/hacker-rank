package hackerrank.algorithms;

/**
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.

 We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .

 Your task is to find their comparison points by comparing  with ,  with , and  with .

 If , then Alice is awarded  point.
 If , then Bob is awarded  point.
 If , then neither person receives a point.
 Comparison points is the total points a person earned.

 Given  and , can you compare the two challenges and print their respective comparison points?

 Input Format

 The first line contains  space-separated integers, , , and , describing the respective values in triplet .
 The second line contains  space-separated integers, , , and , describing the respective values in triplet .

 Constraints

 Output Format

 Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

 Sample Input

 5 6 7
 3 6 10
 Sample Output

 1 1
 Explanation

 In this example:
*/

import java.util.Scanner;

public class CompareTheTriplets {

  static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
    // Complete this function
    int[] scores =  {0, 0};
    if(a0 > b0){
      scores[0] += 1;
    }else if(a0 < b0){
      scores[1] += 1;
    }
    if(a1 > b1){
      scores[0] += 1;
    }else if(a1 < b1){
      scores[1] += 1;
    }

    if(a2 > b2){
      scores[0] += 1;
    }else if(a2 < b2){
      scores[1] += 1;
    }

    return scores;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a0 = in.nextInt();
    int a1 = in.nextInt();
    int a2 = in.nextInt();
    int b0 = in.nextInt();
    int b1 = in.nextInt();
    int b2 = in.nextInt();
    int[] result = solve(a0, a1, a2, b0, b1, b2);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
    }
    System.out.println("");


  }
}