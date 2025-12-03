package december.first;

import java.util.ArrayList;

public class SelectPokemon {
    public int solution(int[] nums) {
        ArrayList<Integer> species = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!species.contains(nums[i])) {
                species.add(nums[i]);
            }
        }
        int speciesNum = species.toArray().length;
        int answer = 0;
        answer = Math.min(nums.length/2, speciesNum);
        return answer;
    }
}
