package com.junapp.service.impl;

import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.junapp.dao.ISimpleDao;
import com.junapp.service.ISimpleService;

@Service("simpleService")
public class SimpleServiceImpl implements ISimpleService {

	@Resource(name = "simpleDao")
	private ISimpleDao simpleDao;

	public String getUserInfo(Map<String, Object> map) {

		return simpleDao.getUserInfo(map);
	}

}
