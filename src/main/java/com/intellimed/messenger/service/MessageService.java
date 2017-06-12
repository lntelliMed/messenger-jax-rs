package com.intellimed.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.intellimed.messenger.database.DatabaseClass;
import com.intellimed.messenger.model.Message;

public class MessageService {
	
	private static Map<Long, Message> messages = DatabaseClass.getMessages();
			
	public MessageService(){
		messages.put(1L, new Message(1L, "Hello World!", new Date(), "user1"));
		messages.put(2L, new Message(2L, "Hello Jersey!", new Date(), "user1"));
	}
			
	public List<Message> getAllMessages(){
//		Message m1 = new Message(1L, "Hello World!", new Date(), "user1");
//		Message m2 = new Message(2L, "Hello Jersey!", new Date(), "user1");
//		List<Message> messages = new ArrayList<>();
//		messages.add(m1);
//		messages.add(m2);
//		return messages;
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if (message.getId() <= 0 ){
			return null;
		}				
		messages.put(message.getId(), message);
		return message;		
	}

	public Message deleteMessage(long id){
		return messages.remove(id);
	}
}
