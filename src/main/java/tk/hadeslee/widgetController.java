package tk.hadeslee;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: spring-boot-hello-world
 * FileName: widgetController
 * Date: 2016-01-20
 * Time: 오후 1:22
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@RequestMapping("/api")
@RestController
public class widgetController {
    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget index() {
        return new Widget("green", 10, 7);
    }
}
