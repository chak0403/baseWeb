/**
 * Copyright (c) 1999 - 2016, Mtel, All rights reserved
 *
 *  File name   : AppStaticDataRepository.java
 *  Create Date : 2016年8月17日
 *  Author      : @author andrew
 */
package repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pojo.AppStaticData;

// TODO: Auto-generated Javadoc
/**
 * The Interface AppStaticDataRepository.
 */
public interface AppStaticDataRepository extends CrudRepository<AppStaticData, Integer> {

	/**
	 * Find by is delete.
	 *
	 * @param delete
	 *            the delete
	 * @return the list
	 */
	public List<AppStaticData> findByIsDeleteFalse(Pageable pageable);

	public AppStaticData findByStaticDataCategoryAndStaticDataTypeAndIsDeleteFalse(String dataCatHousekeep,
			String dataValHousekeepDays);

	public int countByIsDeleteFalse();

	@Query("select u from AppStaticData u where ( u.staticDataCategory like %?1% or u.staticDataType like %?2% ) and u.isDelete = false")
	public List<AppStaticData> tableSearch(String staticDataCategory, String staticDataType, Pageable pageable);

	@Query("select count(u) from AppStaticData u where ( u.staticDataCategory like %?1% or u.staticDataType like %?2% ) and u.isDelete = false")
	public int countTableSearch(String staticDataCategory, String staticDataType);

}
