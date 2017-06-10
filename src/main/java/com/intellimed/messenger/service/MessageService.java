package com.intellimed.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.intellimed.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello World!", new Date(), "user1");
		Message m2 = new Message(2L, "Hello Jersey!", new Date(), "user1");
		List<Message> messages = new ArrayList<>();
		messages.add(m1);
		messages.add(m2);
		return messages;
	}
}
