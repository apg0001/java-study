package chap_06;

public class _04_ParameterAndReturn {
    // 전달값과 반환값이 있는 메소드

    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int retVal = getPower(2); //2 * 2 = 4;
        System.out.println(retVal);

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3, 3);
        System.out.println(retVal);

        System.out.println(getPowerByExp(2, 4));
    }
}
