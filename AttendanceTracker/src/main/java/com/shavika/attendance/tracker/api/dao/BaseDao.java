package com.shavika.attendance.tracker.api.dao;

import java.util.List;

import com.shavika.attendance.tracker.api.dto.BaseDomain;
import com.shavika.attendance.tracker.api.exception.ShavikaAppException;

public abstract interface BaseDao<T extends BaseDomain> {

	public abstract T save(T paramT) throws ShavikaAppException;

	public abstract void update(T paramT) throws ShavikaAppException;

	public abstract void updateById(Class<T> domainObj, long id) throws ShavikaAppException;

	public abstract void delete(T paramT) throws ShavikaAppException;

	public abstract void deleteById(Class<T> domainObj, long id) throws ShavikaAppException;

	public abstract void deleteAll(Class<T> domainObj) throws ShavikaAppException;

	public abstract void saveOrUpdate(List<T> paramList) throws ShavikaAppException;

	public abstract Object find(Class<T> paramClass, long paramInt) throws ShavikaAppException;

	public abstract List<T> findAll(Class<T> paramClass) throws ShavikaAppException;

	public abstract boolean isRecordExist(Class<T> domainObj, long id) throws ShavikaAppException;

}
