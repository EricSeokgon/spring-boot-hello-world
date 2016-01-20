package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: spring-boot-hello-world
 * FileName: testController
 * Date: 2016-01-20
 * Time: 오후 1:28
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class testController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }
}
