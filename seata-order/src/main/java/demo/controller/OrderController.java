package demo.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.jpa.OrderRepo;
import demo.model.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @RequestMapping("/get")
    public String get() {
        // 省略 service
        return orderRepo.findAll().stream().map(Order::toString).collect(Collectors.joining("\n"));
    }
}
