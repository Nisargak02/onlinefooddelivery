package com.cg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.service.IBillService;

@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	IBillService billService;

}
