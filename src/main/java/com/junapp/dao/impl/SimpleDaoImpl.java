package com.junapp.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.junapp.dao.ISimpleDao;
import com.junapp.entity.Simple;

import org.springframework.stereotype.Repository;

@Repository("simpleDao")
public class SimpleDaoImpl extends BaseDaoImpl<Simple> implements ISimpleDao {

	public String getUserInfo(Map<String, Object> map) {
		Map<String, Object> retMap = getSqlSession().selectOne(
				"simple.findSomethingFromDB", map);
		String retStr = "sex=" + retMap.get("sex").toString() + "@@" + "age="
				+ retMap.get("age").toString() + "@@" + "address="
				+ retMap.get("address").toString();

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("username", "jun");
		paramMap.put("password", "66666");
		getSqlSession().insert("simple.insertUser", paramMap);

		paramMap.put("username", "pepe");
		paramMap.put("password", "55555");
		getSqlSession().insert("simple.insertUser", paramMap);
		return retStr;

	}

	@Override
	public List<Simple> selectList(Simple t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Simple selectOneById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Simple t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Simple t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Simple t) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
