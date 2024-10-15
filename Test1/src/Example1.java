import org.w3c.dom.ls.LSOutput;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.io.StringBufferInputStream;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.SortedMap;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("예제1");
        byte a = 1;
        // byte 타입의 크기 (1바이트)만큼 메모리를 활당하고 그 주소를 a라고 부른다.
        // a 위치에 숫자 1을 저장한다.
        byte b = 2;
        int c = a + b;
        b=3; // 기존에 할당받은 메모리 위치인 b자리에 3을 덮어씌우는 코드(데이터타입 사용불가!)
        System.out.println(c);
        char ch1 = 'A'; // char 형은 문자하나만 저장하고 단따움표('   ')를 사용
        char ch2 = 'B';
        System.out.println(""+ch1+ch2); //빈문자열이 포함되면서 숫자가 아닌 문자로 더함
        System.out.println(+ch1); // 유니코드 65 출력
        System.out.println(+ch1+ch2); //131
        String str = "Steve";
        System.out.println(str);
        //문자가 여러개 모인 것은 문자열이라고 함
        //문자열은 데이터탑입을 char 대신 String을 사용 (첫글자가 S가 대문자 주의!!)
        //Boolean 타입 예제
        boolean bool = true; // true는 참의 뜻, false는 거짓의 뜻
        System.out.println(bool);




}
  }