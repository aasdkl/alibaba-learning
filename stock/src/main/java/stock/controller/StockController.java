package stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/desc")
    public String desc() {
        System.out.println("库存减少成功");
        return "stock -1";
    }
}
