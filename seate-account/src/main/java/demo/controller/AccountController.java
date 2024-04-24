package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.jpa.AccountRepo;
import demo.model.Account;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountRepo accountRepo;

    @RequestMapping("/get/{id}")
    public String get(@PathVariable long id) {
        // 省略 service
        return accountRepo.findById(id).map((Account::toString)).orElse("");
    }
}
