public class TestString {
    public static void main(String[] args) {
        String a = "Hello Java";
        System.out.println(a.indexOf("Java"));
        System.out.println(a.replaceAll("Java","World"));
        System.out.println(a.substring(0,4));
        System.out.println(a.toUpperCase());
    }
}

// toUpperCase() 함수를 사용 하면 모든 문자를 대문자로 출력된다.
