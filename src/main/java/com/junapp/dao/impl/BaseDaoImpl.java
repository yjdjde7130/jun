package com.junapp.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.annotation.Resource;
import com.junapp.dao.base.IBaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements IBaseDao<T> {

	private Class<T> clazz;
	
	@Resource(name="sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@SuppressWarnings("unchecked")
	private String getClazzName() {
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];
		System.out.println("DAO的真实实现类是：" + this.clazz.getName());
		return clazz.getName();
	}

	@Override
	public List<T> selectList(T t) {
		return getSqlSession().selectList(getClazzName() + ".selectList", t);
	}

	@Override
	public T selectOneById(String id) {
		return getSqlSession().selectOne(getClazzName() + ".selectOneById", id);
	}

	@Override
	public int insert(T t) {
		return getSqlSession().insert(getClazzName() + ".insert", t);
	}

	@Override
	public int update(T t) {
		return getSqlSession().update(getClazzName() + ".update", t);
	}

	@Override
	public int delete(T t) {
		return getSqlSession().delete(clazz.getName() + ".delete", t);
	}

}
