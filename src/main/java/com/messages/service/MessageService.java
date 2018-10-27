package com.messages.service;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class MessageService {
	
	@RequestMapping(value = "/api/messages",
			method = RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public String getMessage(){
		String str = "hello";
		return str;
	}

}
