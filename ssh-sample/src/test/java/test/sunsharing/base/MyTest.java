package test.sunsharing.base;

import com.sunsharing.base.service.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by criss on 14/12/23.
 */
public class MyTest extends BaseTest {

    @Autowired
    Test test;

    @org.junit.Test
    public void test()
    {
        String a = test.test();
        System.out.println(a);
    }

}
