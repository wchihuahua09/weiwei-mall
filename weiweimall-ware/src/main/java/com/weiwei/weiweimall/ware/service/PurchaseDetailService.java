package com.weiwei.weiweimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.weiwei.common.utils.PageUtils;
import com.weiwei.weiweimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author vivi
 * @email 2022011086@bistu.edu.cn
 * @date 2024-11-05 17:52:38
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

