package company.amazon;

import java.util.*;

class Solution {
    public static void main(String[] args){
        String[] input = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        topKFrequent(input,2);
    }
    private static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word,0)+1);
        }

        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a, b)->{
            if (a.getValue()==b.getValue()) return a.getKey().compareTo(b.getKey());
            else return b.getValue()-a.getValue();
        });

        pq.addAll(map.entrySet());
        List<String> res  = new ArrayList<>();
        while(k>0){
            res.add(pq.poll().getKey());
        }
        return res;
    }
}
