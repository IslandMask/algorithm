import java.util.*;

/*
* 前K个高频单词
* */
public class LeetCode_692_36 {
    public static void main(String[] args) {
        String data[] = {"i","love", "leetcode", "i", "love","love", "coding"};
        List ll = topKFrequent(data,2);
        System.out.println(ll);
    }


    public static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for (String s :words)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
        PriorityQueue<Map.Entry<String,Integer>> queue=new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue()==o2.getValue())
                {
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue()-o1.getValue();
            }
        });
        queue.addAll(map.entrySet());
        List<String> res=new ArrayList<>(k);
        for (int i=0;i<k;i++)
        {
            res.add(queue.poll().getKey());
        }
        return res;
    }
}
