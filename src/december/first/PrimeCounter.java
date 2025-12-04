package december.first;

public class PrimeCounter {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length;
        int checkNum;

        for (int i = 0; i < size-2; i++) {
            for (int j = i+1; j < size-1; j++) {
                for (int k = j+1; k < size; k++) {

                    boolean isPrime = true;
                    checkNum = nums[i] + nums[j] + nums[k];

                    for (int l = 2; l <= Math.sqrt(checkNum); l++) {
                        if (checkNum % l == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if (isPrime) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
