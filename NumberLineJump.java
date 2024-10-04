// Link: https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true

public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        if(v1<=v2){
            return "NO";
        }else{
            while(x1<x2){
                x1 += v1;
                x2 += v2;
            }
            if(x1==x2){
                return "YES";
            }else{
                return "NO";
            }
        }
