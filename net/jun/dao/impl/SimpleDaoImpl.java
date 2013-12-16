package net.jun.dao.impl;

import java.util.HashMap;
import java.util.Map;
import net.jun.dao.ISimpleDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class SimpleDaoImpl extends SqlSessionDaoSupport implements ISimpleDao {

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
}
