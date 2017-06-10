package com.intellimed.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.intellimed.messenger.model.Message;
import com.intellimed.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	private MessageService messageService = new MessageService();

/*    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String getMessages(){
		return "Hello World!";
	}
*/
	
	 @GET
	 @Produces(MediaType.APPLICATION_XML)
	 public List<Message> getMessages(){
		 return messageService.getAllMessages();
	 }
	
}
