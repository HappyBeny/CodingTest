package April.third;

public class HiddenMapDecoder {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder builder;
        char[] a1CharArray;
        char[] a2CharArray;

        for (int i = 0; i < n; i++) {
            builder = new StringBuilder();

            String a1 = Integer.toBinaryString(arr1[i]);
            String a2 = Integer.toBinaryString(arr2[i]);
            a1CharArray = a1.toCharArray();
            a2CharArray = a2.toCharArray();

            String.format("%ns", a1).replace(' ', '0');

            for (int j = 0; j < a1CharArray.length; j++) {
                if (a1CharArray[j] == '1' || a2CharArray[j] == '1') {
                    builder.append("#");
                } else {
                    builder.append(" ");
                }
            }
            answer[i] = builder.toString();
        }
        return answer;
    }
}
