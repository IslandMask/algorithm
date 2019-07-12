import java.util.*;
public class LeetCode_77_36 {
    public static void main(String[] args) {
        System.out.println(combine(5,2));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        getAns(1,n, k, new ArrayList<Integer>(), ans);
        return ans;
    }

    private static void getAns(int start, int n, int k, ArrayList<Integer> temp,List<List<Integer>> ans) {
        //如果 temp 里的数字够了 k 个，加入结果
        if(temp.size() == k){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        //从 start 到 n
        for (int i = start; i <= n; i++) {
            //将当前数字加入 temp
            temp.add(i);
            //递归
            getAns(i+1, n, k, temp, ans);
            //将当前数字删除，进入下次 for 循环 当达到k的数量后， 如{1,2}，删掉后面一个2，即index:size -1 继续循环
            temp.remove(temp.size() - 1);
        }
    }
}
