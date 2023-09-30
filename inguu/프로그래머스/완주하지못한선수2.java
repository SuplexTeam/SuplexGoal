package 프로그래머스;

import java.util.*;
class 완주하지못한선수2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String people : participant) {

            map.put(people, map.getOrDefault(people,0)+1);
        }

        for (String people : completion) {
            map.put(people, map.get(people)-1);
        }

        for (String name : map.keySet()) {
            if (map.get(name) > 0) {
                return name;
            }
        }
        return answer;
    }
}
