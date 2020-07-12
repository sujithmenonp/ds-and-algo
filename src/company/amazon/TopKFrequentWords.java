package company.amazon;

import java.util.*;

/*
keywords = ["anacell", "cetracular", "betacellular"]
reviews = [
  "Anacell provides the best services in the city",
  "betacellular has awesome services",
  "Best services provided by anacell, everyone should use anacell",
]
 */
public class TopKFrequentWords {
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("anacell");
        keywords.add("betacellular");
        keywords.add("cetracular");
        keywords.add("deltacellular");
        keywords.add("eurocell");

        List<String> reviews = new ArrayList<>();
        reviews.add("I love anacell Best services; Best services provided by anacell");
        reviews.add("betacellular has great services");
        reviews.add("deltacellular provides much better services than betacellular");
        reviews.add("cetracular is worse than anacell");
        reviews.add("Betacellular is better than deltacellular.");
        List<String> r = solve(keywords,reviews,2);
        System.out.println(Arrays.toString(r.toArray()));
    }

    private static List<String> solve(List<String> keywords, List<String> reviews, int K) {
        List<String> result = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(String keyword : keywords){
            map.put(keyword.toLowerCase(),0);
        }
        for(String review: reviews){
           review = review.toLowerCase();
            for(String keyword : map.keySet()){
                if(review.contains(keyword)){
                    map.put(keyword,map.get(keyword)+1);
                }
            }


        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(
                (a,b)-> {
                    if(b.getValue().equals(a.getValue())) return a.getKey().compareTo(b.getKey());
                    return b.getValue()-a.getValue();
                });
        pq.addAll(map.entrySet());
        while(K>0){
            result.add(pq.poll().getKey());
            K--;
        }
        return  result;
    }
}
