package com.xay.api.service;

import com.xay.api.dao.model.UpmsUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaogc
 * on 2018/2/8.
 */
public interface UserService {
    List<UpmsUser> findList(UpmsUser upmsUser);
    int saveUser(UpmsUser upmsUser);
    int updateUser(UpmsUser upmsUser);
    int deleteUser(Long id);
    UpmsUser findById(Long id);
}
