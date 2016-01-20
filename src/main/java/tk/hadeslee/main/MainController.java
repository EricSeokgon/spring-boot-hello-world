package tk.hadeslee.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Project: spring-boot-hello-world
 * FileName: MainController
 * Date: 2016-01-20
 * Time: 오후 4:24
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class MainController {
    @RequestMapping(method = RequestMethod.GET, value = {"/", "/index.html"})
    public String main(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
        System.out.println("main!");

        return "/wcl/main/index";
    }
}
