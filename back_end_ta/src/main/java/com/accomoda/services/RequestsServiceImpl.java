package com.accomoda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accomoda.daos.RequestsDao;
import com.accomoda.entities.Requests;

@Transactional
@Service
public class RequestsServiceImpl {

	@Autowired
	private RequestsDao requestDao; 
	
	public List<Requests> findAllRequests() {
		return requestDao.findAll();
	}
	
	public Requests findRequestById(int id) {
		return requestDao.findById(id);
	}
	
	public Requests findRequestBySenderId(int senderId) {
		return requestDao.findById(senderId);
	}
	public Requests save(Requests requests) {
		return requestDao.save(requests);
	}
	
	public int deleteRequestsById(int id) {
		if(requestDao.existsById(id)) {
			requestDao.deleteById(id);
			return 1;
		}
		return 0;
	}
	public Requests update(Requests req)
	{
		
		if(req.getStatus().equals("pending"))
		{
			req.setStatus("Approved");
			requestDao.save(req);
			return req;
		}
		else return null;
		
	}
}
