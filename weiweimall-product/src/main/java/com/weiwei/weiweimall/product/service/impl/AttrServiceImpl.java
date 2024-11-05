package com.weiwei.weiweimall.product.service.impl;

import com.weiwei.weiweimall.product.service.AttrService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weiwei.common.utils.PageUtils;
import com.weiwei.common.utils.Query;

import com.weiwei.weiweimall.product.dao.AttrDao;
import com.weiwei.weiweimall.product.entity.AttrEntity;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageUtils(page);
    }

}