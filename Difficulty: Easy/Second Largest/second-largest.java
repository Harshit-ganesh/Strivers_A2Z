//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner ss = new Scanner(input);
            while (ss.hasNextInt()) {
                arr.add(ss.nextInt());
            }
            Solution ob = new Solution();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        if(arr.size() < 2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_Large = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) > large){
                second_Large = large;
                large = arr.get(i);
            } 
            else if(arr.get(i) > second_Large && arr.get(i) != large){
                second_Large = arr.get(i);
            }
        }
        return second_Large == Integer.MIN_VALUE ? -1 : second_Large;
    }
}