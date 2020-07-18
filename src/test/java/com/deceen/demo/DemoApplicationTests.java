package com.deceen.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        BCryptPasswordEncoder bcp = new BCryptPasswordEncoder();
        String mm_pub = "123456";
        String mm_encode = bcp.encode(mm_pub);
        System.out.println(mm_encode);
    }

}
