package com.prj.chatapp.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prj.chatapp.model.MsgData;

@RestController
public class ChatController {

	public static final Logger LOGGER = LoggerFactory.getLogger(ChatController.class);

	private final SimpMessagingTemplate simpMessagingTemplate;

	public ChatController(SimpMessagingTemplate simpMessagingTemplate) {
		this.simpMessagingTemplate = simpMessagingTemplate;
	}

	@MessageMapping("/sendToAll")
	@SendTo("/topic/sendToAll")
	public String sendToAll(@Payload MsgData msgData, Principal principal) {
		LOGGER.error(principal.getName());
		return msgData.getMessage();
	}

	@MessageMapping("/message")
	@SendTo("/")
	public void greeting(MsgData msgData) {
		LOGGER.error("To user : " + msgData.getTo());
		simpMessagingTemplate.convertAndSendToUser(msgData.getTo(), "/msg", msgData.getMessage());
		// simpMessagingTemplate.convertAndSend("/user/ramesh/msg",
		// msgData.getMessage());
	}
	
	
	@GetMapping("/getUsername")
	public String getUsername(Principal principal){
		return principal.getName();
	}
}
