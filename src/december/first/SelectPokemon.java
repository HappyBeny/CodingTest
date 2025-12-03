package december.first;

import java.util.HashSet;

public class SelectPokemon {
    public int solution(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        return Math.min(nums.length / 2, hs.size());
    }
}
