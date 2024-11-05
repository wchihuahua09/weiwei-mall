package com.weiwei.weiweimall.member.feign;

import com.weiwei.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("weiweimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    //@RequiresPermissions("coupon:coupon:list")
    R memberCoupons();

}
