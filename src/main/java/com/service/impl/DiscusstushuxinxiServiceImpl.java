package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusstushuxinxiDao;
import com.entity.DiscusstushuxinxiEntity;
import com.service.DiscusstushuxinxiService;
import com.entity.vo.DiscusstushuxinxiVO;
import com.entity.view.DiscusstushuxinxiView;

@Service("discusstushuxinxiService")
public class DiscusstushuxinxiServiceImpl extends ServiceImpl<DiscusstushuxinxiDao, DiscusstushuxinxiEntity> implements DiscusstushuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstushuxinxiEntity> page = this.selectPage(
                new Query<DiscusstushuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusstushuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstushuxinxiEntity> wrapper) {
		  Page<DiscusstushuxinxiView> page =new Query<DiscusstushuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstushuxinxiVO> selectListVO(Wrapper<DiscusstushuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstushuxinxiVO selectVO(Wrapper<DiscusstushuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstushuxinxiView> selectListView(Wrapper<DiscusstushuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstushuxinxiView selectView(Wrapper<DiscusstushuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
