package ru.faton.warehouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WarehouseController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="id", required=false) String id) {

        System.out.println("id---> " +id);

        return "";
    }
}
