package com.owlpad.ui.repository;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.owlpad.domain.configuration.Configuration;
import com.owlpad.service.configuration.ConfigurationService;

public class ConfigRepository {
	//private static final Logger logger = LoggerFactory.getLogger(ConfigRepository.class);
	private ConfigurationService configService;
	
	@Autowired
	public ConfigRepository(ConfigurationService configService){
		this.configService = configService;
	}
	
	public Configuration getConfig(){
		Response res = this.configService.getUserConfiguration();
		
		if(res!= null && res.getStatus() == 200){
			return res.readEntity(Configuration.class);					
		}
		return null;
	}
}
