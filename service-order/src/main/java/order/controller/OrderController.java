package order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import order.feign.ProductService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ProductService productService;

    @RequestMapping("/add")
    public String order() {
        String product = productService.get(12);
        System.out.println("下单成功");
        String msg = restTemplate.getForObject("http://service-stock/stock/desc", String.class);
        return "order done > " + product + " > " + msg;
    }
}
