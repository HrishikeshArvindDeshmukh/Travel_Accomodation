package com.accomoda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accomoda.entities.Requests;
import com.accomoda.services.RequestsServiceImpl;

@Controller
public class RequestsController {

	@Autowired
	private RequestsServiceImpl requestsService;
	
	@GetMapping("/requests")
	public @ResponseBody List<Requests> findAll() {
		List<Requests> result = requestsService.findAllRequests();
		return result;
	}
	
	@GetMapping("/requests/{id}")
	public @ResponseBody Object findById(@PathVariable("id") int id) {
		Requests result = requestsService.findRequestById(id);
		if(result == null)
			return "Request not found";
		return result;
	}
	
	@GetMapping("/requests/getAllByReceiverId/{receiverId}")
	public @ResponseBody List<Requests> findAllByReceiverId() {
		List<Requests> result = requestsService.findAllRequests();
		return result;
	}
	
	@GetMapping("/requests/getRequestBySenderId/{id}")
	public @ResponseBody Object findBySenderId(@PathVariable("id") int id) {
		Requests result = requestsService.findRequestById(id);
		if(result == null)
			return "Request not found";
		return result;
	}
	
	@PostMapping("/requests")
	public @ResponseBody Requests save(@RequestBody Requests requests) {
		Requests result = requestsService.save(requests);
		return result;
	}
	
	@PostMapping("/requests/{id}")
	public @ResponseBody Requests update(@PathVariable("id") int id) {
	
		Requests req=requestsService.findRequestById(id);
		requestsService.update(req);
		return req;
	}	
//	
	@DeleteMapping("/requests/{id}")
	public @ResponseBody String deleteRequestsById(@PathVariable("id") int id) {
		int count = requestsService.deleteRequestsById(id);
		return "Records Deleted: " + count;
	}
}
