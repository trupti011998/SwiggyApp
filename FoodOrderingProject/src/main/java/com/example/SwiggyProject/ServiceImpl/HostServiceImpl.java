package com.example.SwiggyProject.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.SwiggyProject.Model.Host;
import com.example.SwiggyProject.Repository.HostRepository;
import com.example.SwiggyProject.Service.HostService;

public class HostServiceImpl {

	//implements HostService
	@Autowired
	private HostRepository hostRepository;
	
	
	public HostServiceImpl(HostRepository hostRepository) {
		super();
		this.hostRepository = hostRepository;
	}


//	@Override
//	public Host saveHost(Host host) {
//		return hostRepository.save(host);
//	}

}
