package net.jun.dao.impl;

import java.util.HashMap;
import java.util.Map;

import net.jun.dao.ISimpleDao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class SimpleDaoImpl implements ISimpleDao {

	private SqlSessionFactory sqlSessionFactory;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public String getUserInfo(Map<String, Object> map) {
		SqlSession session = sqlSessionFactory.openSession();
		Map<String, Object> retMap = session.selectOne(
				"simple.findSomethingFromDB", map);
		String retStr = "sex=" + retMap.get("sex").toString() + "@@" + "age="
				+ retMap.get("age").toString() + "@@" + "address="
				+ retMap.get("address").toString();

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("username", "jun");
		paramMap.put("password", "66666");
		session.insert("simple.insertUser", paramMap);

		paramMap.put("username", "pepe");
		paramMap.put("password", "55555");
		session.insert("simple.insertUser", paramMap);
		return retStr;

	}
}
