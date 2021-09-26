// Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value that describe a range of integers, inclusive of the endpoints. Sherlock must determine the number of square integers within that range.

// Note: A square integer is an integer which is the square of an integer, e.g. .

// Example


// There are three square integers in the range:  and . Return .

// Function Description

// Complete the squares function in the editor below. It should return an integer representing the number of square integers in the inclusive range from  to .

// squares has the following parameter(s):

// int a: the lower range boundary
// int b: the upper range boundary
// Returns

// int: the number of square integers in the range
// Input Format

// The first line contains , the number of test cases.
// Each of the next  lines contains two space-separated integers,  and , the starting and ending integers in the ranges.

// Constraints



// Sample Input

// 2
// 3 9
// 17 24
// Sample Output

// 2
// 0
// Explanation

// Test Case #00: In range ,  and  are the two square integers.
// Test Case #01: In range , there are no square integers.







import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'squares' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     */

    public static int squares(int a, int b) {
        int count=0;
    for(int i=a+1;i<b;i++){
        int sr=(int) Math.sqrt(i);
        if((sr*sr)==i){
            count++;
        }
    }
    return count;

    }   // --- This is O(n)- Time Complexity 

    double countSquares(int a, int b)
    {
        return (Math.floor(Math.sqrt(b)) - (Math.ceil(Math.sqrt(a))) + 1);
    }   // ---- Time complexity ()

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int a = Integer.parseInt(firstMultipleInput[0]);

            int b = Integer.parseInt(firstMultipleInput[1]);

            int result = Result.squares(a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
