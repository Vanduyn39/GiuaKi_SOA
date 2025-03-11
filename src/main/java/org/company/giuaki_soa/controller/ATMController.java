package org.company.giuaki_soa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ATMController {

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    @GetMapping("/atm")
    public String atm(Model model) {
        return "atm";
    }
    @GetMapping("/cus")
    public String cus(Model model) {
        return "custom-amount";
    }
}
