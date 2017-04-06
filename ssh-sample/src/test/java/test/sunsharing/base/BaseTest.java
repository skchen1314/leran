package test.sunsharing.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by criss on 14/12/23.
 */
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class BaseTest extends AbstractJUnit4SpringContextTests {

    @Before
    public void before()
    {
        System.out.println("before");
    }

    @After
    public void after()
    {
        System.out.println("after");
    }

}
