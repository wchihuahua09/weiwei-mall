package com.weiwei.weiweimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.weiwei.common.utils.PageUtils;
import com.weiwei.weiweimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author vivi
 * @email 2022011086@bistu.edu.cn
 * @date 2024-11-05 17:39:03
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

