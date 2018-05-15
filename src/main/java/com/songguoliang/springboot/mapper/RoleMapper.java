package com.songguoliang.springboot.mapper;

import com.songguoliang.springboot.base.BaseMapper;
import com.songguoliang.springboot.entity.Role;

import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-11 15:05
 */
public interface RoleMapper extends BaseMapper<Role>{
    List<Role>getRolesByUserId(Long userId);
}
