package com.weiwei.weiweimall.order.dao;

import com.weiwei.weiweimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author vivi
 * @email 2022011086@bistu.edu.cn
 * @date 2024-11-05 17:49:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
