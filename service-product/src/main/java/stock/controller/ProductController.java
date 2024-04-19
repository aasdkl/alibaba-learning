package stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RefreshScope
public class ProductController {

//    @Autowired
//    private Environment environment;
//    environment.getProperty("server.port")

    @Value("${server.port}")
    String port;

    @Value("${demo.id}")
    String demoId;

    @Value("${demo.name}")
    String demoName;

    // feign 不支持多路径，所以两个 get 方法不能合并
    @RequestMapping("/get/{id}")
    public String get(@PathVariable int id) {
        System.out.println("商品 " + id);
        return "[product " + id + " by "+ port + "]";
    }

    @RequestMapping("/get")
    public String get() {
        return "[product " + demoId + "-" + demoName + "]";
    }

}
