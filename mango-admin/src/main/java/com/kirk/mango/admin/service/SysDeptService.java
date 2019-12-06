package com.kirk.mango.admin.service;

import java.util.List;

import com.kirk.mango.admin.model.SysDept;
import com.kirk.mango.core.service.CurdService;

/**
 * 机构管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param
	 * @return
	 */
	List<SysDept> findTree();
}
