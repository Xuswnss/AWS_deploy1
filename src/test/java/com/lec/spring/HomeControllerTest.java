package com.lec.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
/*TODO
*  임의에 포트로 서버를 테스트 할 수 있는 옵션이당.*/
class HomeControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    /*TODO
        내부적으로 스프링서버를 가동시킨다*/

    @Test
    void hello(){
        ResponseEntity<String> response = restTemplate.getForEntity("/aws/v1", String.class);
        /*TODO
            1번째 매개변수가 2번째 매개변수랑 같다면 어쩌구 하는거 = assertEqulas
         */
       assertEquals("<h1>AWS 배포 v1.1</h1>", response.getBody());
    }


}