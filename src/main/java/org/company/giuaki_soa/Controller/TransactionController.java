package org.company.giuaki_soa.Controller;

import org.company.giuaki_soa.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/perform")
    public String performTransaction(@RequestParam String username,
                                     @RequestParam String password,
                                     @RequestParam double amount) {
        return transactionService.performTransaction(username, password, amount);
    }
}