package biz.seagull.crmcontroller.controller;

import biz.seagull.database.service.LeadService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeadController {

    private final LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }
}
