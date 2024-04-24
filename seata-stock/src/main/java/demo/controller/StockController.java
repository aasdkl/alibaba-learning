package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.jpa.StockRepo;
import demo.model.Stock;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    StockRepo stockRepo;

    @RequestMapping("/get/{id}")
    public String get(@PathVariable long id) {
        // 省略 service
        return stockRepo.findById(id).map((Stock::toString)).orElse("");
    }
}
