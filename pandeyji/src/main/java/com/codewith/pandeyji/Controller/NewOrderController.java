package com.codewith.pandeyji.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewOrderController {
    
    @GetMapping("/order")
    public String NewOrder(@RequestParam String item){
        return "Your order "+ item +" has been deliverd";
    }
    
}
