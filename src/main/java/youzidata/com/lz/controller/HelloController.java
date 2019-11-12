package youzidata.com.lz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("helloworld")
    public String helloWorld(){
        System.out.println("abbb");
        System.out.println("aaa");
        System.out.println("ddd");
        System.out.println("ggg");

        System.out.println("ccccssss");

        System.out.println("cccc");
        System.out.println("fff");

        //System.out.println("1");
        System.out.println("fff222222222222222");
        //System.out.println("33333333333333333333");

        return "hello 哈哈哈 3.0 完美自动部署bbbaaaccc";
    }
}
