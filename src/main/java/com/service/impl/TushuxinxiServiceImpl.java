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


import com.dao.TushuxinxiDao;
import com.entity.TushuxinxiEntity;
import com.service.TushuxinxiService;
import com.entity.vo.TushuxinxiVO;
import com.entity.view.TushuxinxiView;

@Service("tushuxinxiService")
public class TushuxinxiServiceImpl extends ServiceImpl<TushuxinxiDao, TushuxinxiEntity> implements TushuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushuxinxiEntity> page = this.selectPage(
                new Query<TushuxinxiEntity>(params).getPage(),
                new EntityWrapper<TushuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushuxinxiEntity> wrapper) {
		  Page<TushuxinxiView> page =new Query<TushuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushuxinxiVO> selectListVO(Wrapper<TushuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushuxinxiVO selectVO(Wrapper<TushuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushuxinxiView> selectListView(Wrapper<TushuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushuxinxiView selectView(Wrapper<TushuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<TushuxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<TushuxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<TushuxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
