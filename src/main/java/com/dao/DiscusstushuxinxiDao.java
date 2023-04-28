package com.dao;

import com.entity.DiscusstushuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstushuxinxiVO;
import com.entity.view.DiscusstushuxinxiView;


/**
 * 图书信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-01-18 10:58:17
 */
public interface DiscusstushuxinxiDao extends BaseMapper<DiscusstushuxinxiEntity> {
	
	List<DiscusstushuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
	
	DiscusstushuxinxiVO selectVO(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
	
	List<DiscusstushuxinxiView> selectListView(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);

	List<DiscusstushuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
	
	DiscusstushuxinxiView selectView(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
	

}
