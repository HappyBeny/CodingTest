package december.first;

public class CheckPrime {

    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (i == 2) {
                answer++;
            } else {
                if (isPrime(i)) {
                    answer++;
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int number) {
        for (int l = 2; l <= Math.sqrt(number); l++) {
            if (number % l == 0) {
                return false;
            }
        }
        return true;
    }
}