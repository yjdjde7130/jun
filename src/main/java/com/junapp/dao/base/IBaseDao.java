package com.junapp.dao.base;

import java.util.List;

/**
 * 公共DAO接口，定义CRUD操作
 * 
 * @author Administrator
 * 
 * @param <T>
 *            表示传入实体类
 */
public interface IBaseDao<T> {

	/**
	 * 
	 * @param t
	 * @return
	 */
	public List<T> selectList(T t);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public T selectOneById(String id);

	/**
	 * 
	 * @param t
	 * @return
	 */
	public int insert(T t);

	/**
	 * 
	 * @param t
	 * @return
	 */
	public int update(T t);

	/**
	 * 
	 * @param t
	 * @return
	 */
	public int delete(T t);
}
