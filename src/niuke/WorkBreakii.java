package niuke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WorkBreakii {
    /**
     * 动态规划：给定一个字符串s和一组单词dict，判断s是否可以用空格分割成一个单词序列
     * local[i]表示前i个字符（0 - (i-1)）表示的字符串在dict中存在
     * local[i] = 前j个字符可以分词 && 第j - （i-1）的子串存在在dict中。
    * @param s
     * @param dict
     * @return
     */
    public static boolean workBreak(String s , Set<String> dict){
        if(dict == null || dict.size()== 0) return false;
        int n = s.length();
        boolean[] local = new boolean[n + 1];
        local[0] = true;
        for(int i = 1; i <= n; i++) {
            //记住要break!!!
            for(int j = 0; j < i; j++){
                if(local[j] && dict.contains(s.substring(j,i))){
                    local[i] = true;
                    break;
                }
            }
        }
        return local[n];
    }
    public static void main(String[] args) {
        String s = "leetcode";
        Set<String> dict = new HashSet<>(
            Arrays.asList("leet","code"));
        System.out.println(workBreak(s,dict));
    }
}
