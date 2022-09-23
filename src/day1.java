public class day1 {
    public static void main(String[] args) {
        /* 자바 자료형 */
        int money = 3000; // 정수 자료형
        long count = 876983745956L; // 끝에 L을 반드시 붙여야 함.
        float pi = 3.14F; // 실수 자료형, 끝에 F를 붙여야 함.
        double d1 = 123.4;
        double d2 = 1.234e2; // d1과 d2는 같음

        int octal = 023; // 십진수 19
        int hex = 0xC; // 십진수 12

        System.out.println(7 % 3); // 나머지 출력:1
        System.out.println(7/3); // 몫 출력: 2

        int base = 180;
        int height = 185;
        boolean isTall = height > base; // 불 연산자

        if (isTall){
            System.out.println("키가 큽니다.");
        }
        int i = 3;
        boolean isOdd = i%2 == 1;
        System.out.println(isOdd); // True 출력

        char a1 = 'a';
        char a2 = 97; //아스키 코드
        char a3 = '\u0061'; // 유니코드
        System.out.println(a2);
        System.out.println(a3);


    }

}
