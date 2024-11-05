package com.weiwei.weiweimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.weiwei.common.utils.PageUtils;
import com.weiwei.weiweimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author vivi
 * @email 2022011086@bistu.edu.cn
 * @date 2024-11-05 17:49:20
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

