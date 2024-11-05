package com.weiwei.weiweimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.weiwei.common.utils.PageUtils;
import com.weiwei.weiweimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author vivi
 * @email 2022011086@bistu.edu.cn
 * @date 2024-11-05 18:34:15
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

