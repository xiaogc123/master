package com.xay.api.service.impl;

import com.xay.api.dao.mapper.UpmsUserMapper;
import com.xay.api.dao.model.UpmsUser;
import com.xay.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaogc
 * on 2018/2/8.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UpmsUserMapper mapper;
    @Override
    public List<UpmsUser> findList(UpmsUser upmsUser) {
        return mapper.selectAll();
    }

    @Override
    public int saveUser(UpmsUser upmsUser) {
        return mapper.insert(upmsUser);
    }

    @Override
    public int updateUser(UpmsUser upmsUser) {
        return mapper.updateByPrimaryKey(upmsUser);
    }

    @Override
    public int deleteUser(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public UpmsUser findById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
