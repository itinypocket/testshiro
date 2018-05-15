package com.songguoliang.springboot.service;

import com.songguoliang.springboot.entity.Resource;
import com.songguoliang.springboot.mapper.ResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-11 15:21
 */
@Service
public class ResourceService {
    @Autowired
    private ResourceMapper resourceMapper;

    public List<Resource> getByRoleId(Long roleId) {
        return resourceMapper.getByRoleId(roleId);
    }
}
