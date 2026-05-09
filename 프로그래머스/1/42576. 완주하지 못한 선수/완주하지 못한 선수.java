import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        // 1. 참가자 카운트
        for(String name : participant){
            map.put(name, map.getOrDefault(name, 0)+1);
        }
        
        // 2. 완주차 차감
        for(String name : completion){
            map.put(name, map.get(name)-1);
        }
        
        // 3. 남은 사람 찾기 
        for(String name : map.keySet()){
            if(map.get(name) > 0){
                return name;
            }
        }
        

        return "";
    }
}