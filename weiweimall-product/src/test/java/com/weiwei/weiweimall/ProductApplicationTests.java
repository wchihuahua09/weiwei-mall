package com.weiwei.weiweimall;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.weiwei.weiweimall.product.entity.BrandEntity;
import com.weiwei.weiweimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("遥遥领先失败");
//        brandEntity.setName("华为");
//        brandEntity.setBrandId(1L);
//        System.out.println("保存成功");
//        brandService.updateById(brandEntity);
        BrandEntity brand = brandService.getOne(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        System.out.println(brand);
    }

}
