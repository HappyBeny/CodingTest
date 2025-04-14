package April.second;

public class CountPnY {
    boolean solution(String s) {
        long p = s.toLowerCase().chars().filter(c -> c == 'p').count();
        long y = s.toLowerCase().chars().filter(c -> c == 'y').count();

        boolean answer = p == y;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        return answer;
    }
}
