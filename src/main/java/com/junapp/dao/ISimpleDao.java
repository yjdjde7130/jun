package com.junapp.dao;

import java.util.Map;
import com.junapp.dao.base.IBaseDao;
import com.junapp.entity.Simple;

public interface ISimpleDao extends IBaseDao<Simple> {

	public String getUserInfo(Map<String, Object> map);

}
