package net.jun.service.impl;

import java.util.Map;

import net.jun.dao.ISimpleDao;
import net.jun.service.ISimpleService;

public class SimpleServiceImpl implements ISimpleService {

	private ISimpleDao simpleDao;

	public void setSimpleDao(ISimpleDao simpleDao) {
		this.simpleDao = simpleDao;
	}

	public String getUserInfo(Map<String, Object> map) {

		return simpleDao.getUserInfo(map);
	}

}
