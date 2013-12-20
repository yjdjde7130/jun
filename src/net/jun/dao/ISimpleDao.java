package net.jun.dao;

import java.util.Map;
import net.jun.dao.base.IBaseDao;
import net.jun.entity.Simple;

public interface ISimpleDao extends IBaseDao<Simple> {

	public String getUserInfo(Map<String, Object> map);

}
