package kr.co.buy4me;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Buy4meApplicationTests {

    Logger logger = LoggerFactory.getLogger(Buy4meApplicationTests.class);

    @Test
    public void contextLoads() {

        logger.info("테스트 인포");
        logger.debug("테스트 디버그");
    }

}
