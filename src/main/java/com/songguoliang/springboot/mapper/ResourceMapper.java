package com.songguoliang.springboot.mapper;

import com.songguoliang.springboot.base.BaseMapper;
import com.songguoliang.springboot.entity.Resource;

import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-11 15:14
 */
public interface ResourceMapper extends BaseMapper<Resource>{
    List<Resource>getByRoleId(Long roleId);
}
