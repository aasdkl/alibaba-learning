package stock.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

//    @Autowired
//    private Environment environment;
//    environment.getProperty("server.port")

    @Value("${server.port}")
    String port;

    @RequestMapping("/get/{id}")
    public String get(@PathVariable int id) {
        System.out.println("商品 " + id);
        return "[product " + id + " by "+ port + "]";
    }
}
