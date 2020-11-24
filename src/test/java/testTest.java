import org.junit.Test;

import static org.junit.Assert.*;

public class testTest {
    @Test
    public void main() {

    }

    @Test
    public void run() {
        assertEquals("是时间",new test().run("12:00:00"));
        //assertEquals("是日期",new test().run("2020-11-11"));
        //assertEquals("不是日期也不是时间",new test().run("1123456"));
    }
}