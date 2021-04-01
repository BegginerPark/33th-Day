public class Stringexam {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = new String("hello");
        System.out.println(a.equals(b)); // false
        System.out.println(a.equals(c)); // true
        System.out.println(a == c); // true 
        System.out.println(a == d); // false
        System.out.println(a.equals(d)); // true 
        System.out.println(System.identityHashCode(a)); // id 를 확인 하는 코드
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
    }
}

// 글자 자체가 같은지 확인 하려 할때 사용 하는 것이 .equals() 함수 이다.
// new 를 사용하게 되면 새로운 객체를 생성한다. 
// 여기서 a 와 b의 hello 는 같은 hello 이지만 
// a 와 d 는 같은 hello 이지만 서로 다른 존재 이기 때문에 == 를 사용하게 되면 false 가 나오게 된다.
// 즉 a 와 b 는 같은 주소이고 a 와 d 는 다른 주소이다.

// 원시 자료형 (int, long, double, float, boolean, char 등)
// 원시 자료형은 new 키워드로 생성 할 수 없다.
