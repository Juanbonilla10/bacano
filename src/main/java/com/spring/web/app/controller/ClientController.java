package com.spring.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.web.app.model.ResponseModel;
import com.spring.web.app.service.ClienteService;

@Controller
@RequestMapping("ClienteS/")
public class ClientController {
	
	@Autowired
	private ClienteService ClienteS;
	

    @GetMapping(value = "list")
    public ResponseEntity list() {
        ResponseModel response = this.ClienteS.list();
        return new ResponseEntity(response, response.getStatusCode() == 200 ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
}
