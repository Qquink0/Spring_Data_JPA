package org.example.spring.controllers;

import org.example.spring.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test-batch-update")
public class BatchController {

    private final PeopleService peopleService;

    @Autowired
    public BatchController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping()
    public String index() {
        return "batch/index";
    }

//    @GetMapping("/without")
//    public String withoutBatch() {
//        personDAO.testMultipleUpdate();
//        return "redirect:/people";
//    }
//
//    @GetMapping("/with")
//    public String withBatch() {
//        personDAO.testBatchUpdate();
//        return "redirect:/people";
//    }

}
