package com.itkey.sam.writer.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itkey.sam.writer.model.service.WriterService;

@Controller
public class WriterController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired WriterService writerService;
	
	@RequestMapping(value = "/login.do")
	public ModelAndView login(@RequestParam Map<String, Object> requestParam) throws Exception {
		return null;
		
	}

}
