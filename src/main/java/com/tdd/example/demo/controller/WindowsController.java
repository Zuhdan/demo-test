package com.tdd.example.demo.controller;

import com.tdd.example.demo.model.Product;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WindowsController {

    @GetMapping("/help")
    public String help() {
        return "Ok This is Our Help for You! :)";
    }

    @GetMapping("/drools")
    public String drools() {
        Product product = new Product("Sendals", 1000, "Sale");
        KieSession ksession = KieServices.Factory.get().getKieClasspathContainer().newKieSession("RulesHomeKS");
        ksession.insert(product);
        ksession.fireAllRules();
        ksession.dispose();
        return product.getStatus();
    }

}