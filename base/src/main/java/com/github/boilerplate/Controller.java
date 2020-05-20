package com.github.boilerplate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public Boilerplate createReportCatalog() {
        return new Boilerplate(1L, "boilerplate", "comment");
    }
}
