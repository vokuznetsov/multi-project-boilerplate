package com.github.boilerplate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public Report createReportCatalog() {
        String str = "Hello world!";

        Report report = new Report();
        report.setValue(str);

        return report;
    }
}
