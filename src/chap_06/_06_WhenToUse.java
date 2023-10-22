package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number, int exponent) {
        int result = number;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2));

        // 3의 3승을 구하기
        System.out.println(getPower(3, 3));

        // 4의 4승을 구하기
        System.out.println(getPower(4, 4));
    }
}
