import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        long sum=0l;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextLong();
            sum+=arr[arr_i];
        }
        System.out.println(sum);
    }
}
