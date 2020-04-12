package String;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Anagram obj = new Anagram();
        String[] a = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        obj.solve(a);
    }

    private void solve(String[] a) {
        Map<String, HashSet<String>> map = new HashMap<>();
        Arrays.sort(a, (a1, a2)->{
            char[] chars = a1.toCharArray();
            Arrays.sort(chars);
            String b1 = new String(chars);

            chars = a2.toCharArray();
            Arrays.sort(chars);
            String b2 = new String(chars);


            if(map.containsKey(b1)){
                map.get(b1).add(a1);
            }else{
                map.put(b1,new HashSet<>());
                map.get(b1).add(a1);
            }

            if(map.containsKey(b2)){
                map.get(b2).add(a2);
            }else{
                map.put(b2,new HashSet<>());
                map.get(b2).add(a2);
            }

            return b1.compareTo(b2);
        });

        List<List<String>> r = new ArrayList<>();

        for(String s : map.keySet()){
            List<String> r2 = new ArrayList<>();
            for(String a2 :map.get(s)){
                r2.add(a2);
            }
            r.add(r2);
        }



        System.out.println(r.toString());
    }
}
