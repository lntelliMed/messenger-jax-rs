package com.intellimed.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	 //@Produces(MediaType.APPLICATION_XML)
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<Message> getMessages(){
		 return messageService.getAllMessages();
	 }
	 
	 @GET
	 @Path("/{messageId}")
	 //@Produces(MediaType.APPLICATION_XML)
	 @Produces(MediaType.APPLICATION_JSON)
	 public Message getMessages(@PathParam("messageId") long messageId){
		 return messageService.getMessage(messageId);
	 }
	 
	 @POST
	 @Consumes(MediaType.APPLICATION_JSON)
	 @Produces(MediaType.APPLICATION_JSON)
	 public Message addMessages(Message message){
		 return messageService.addMessage(message);
	 }
	
}
