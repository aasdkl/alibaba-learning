package stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

//    @Autowired
//    private Environment environment;
//    environment.getProperty("server.port")

    @Value("${server.port}")
    String port;

    @RequestMapping("/desc")
    public String desc() {
        System.out.println("库存减少成功");
        return "stock -1 in " + port;
    }
}
