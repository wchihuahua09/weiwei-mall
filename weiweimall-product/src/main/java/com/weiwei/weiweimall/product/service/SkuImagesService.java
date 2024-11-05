package com.weiwei.weiweimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.weiwei.common.utils.PageUtils;
import com.weiwei.weiweimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author vivi
 * @email 2022011086@bistu.edu.cn
 * @date 2024-11-05 16:27:07
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
