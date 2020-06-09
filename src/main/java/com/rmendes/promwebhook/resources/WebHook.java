package com.rmendes.promwebhook.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import com.rmendes.promwebhook.model.AlertManagerPayload;

@Path("/alerts")
public class WebHook {

    @POST
    public String receiveAlert(@RequestBody AlertManagerPayload alert) {
    	System.out.println(alert.getStatus()+" - "+alert.getReceiver());
    	return alert.getStatus();
    }
}