package chap_01;

public class _05_VariablesNaming {
    public static void main(String[] args) {
        /*
        변수 이름 짓는 법
        1. 저장할 값에 어울리는 이름
        2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
        3. 밑줄 또는 문자로 시작 가능
        4. 한 단어 또는 2개 이상 단어의 연속
        5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        6. 예약어 사용 불가
         */

        // 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "기찬";
        String lastName = "박";
        String dateOfBirth = "2001-07-11";
        String residentialAdress = "신라호텔";
        String purposeOfVisit = "관광";
        String flightNo = "AA111";
        String _flightNo = "AA111";
        //String -flightNo = "AA111";
        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "가방";
        // String 3item = "전자제품";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
