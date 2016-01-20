package tk.hadeslee.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tk.hadeslee.domain.User;
import tk.hadeslee.repository.UserRepository;

import java.util.List;

/**
 * Project: spring-boot-hello-world
 * FileName: MainController
 * Date: 2016-01-20
 * Time: 오후 4:24
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class MainController {

    @Autowired private UserRepository userRepository;

    @RequestMapping("/")
    public @ResponseBody String index(){
        return "Hello hadeslee spring boot!";
    }

    @RequestMapping("/users")
    public @ResponseBody
    List<User> getUserList(){
        return userRepository.findAll();
    }


}
