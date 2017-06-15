package com.cvssp.selectednumber.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cvssp.selectednumber.service.GeneratorService;
import com.cvssp.selectednumber.service.UserService;

@RestController
public class IndexController {

    @Autowired
    UserService userService;
	
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
    	long count = userService.count();
        return ""+count;
    }
}
