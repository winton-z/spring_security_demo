import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestCode {


    @Test
    public void test(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String s = encoder.encode("123");
        System.out.println(s);
    }

}
