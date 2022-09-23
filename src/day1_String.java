public class day1_String {
    public static void main(String[] args){
    // String 자료형, 내장 메소드, 포매팅
    String a = new String("Happy Java");
    System.out.println(a);
    // 내장 메소드
    String b = "hello";
    String c = "Happy Java";
    System.out.println(a.equals(b));
    System.out.println(a.equals(c)); // 문자열이 동일한지 비교

    System.out.println(a.indexOf("Java")); // 문자가 시작되는 위치 리턴
    System.out.println(a.contains("Java")); //문자열이 포함되어있는지 여부 출력


    }
}
