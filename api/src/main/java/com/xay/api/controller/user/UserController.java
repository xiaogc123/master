package com.xay.api.controller.user;

import com.xay.api.dao.model.UpmsUser;
import com.xay.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xiaogc
 * on 2018/2/8.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "{userId}")
    public UpmsUser get(@PathVariable("userId") Long userId){
        return userService.findById(userId);
    }
    @PostMapping(value = "list")
    public Object list(@RequestBody UpmsUser upmsUser){
        return userService.findList(upmsUser);
    }
    @PutMapping(value = "")
    public void update(@RequestBody UpmsUser upmsUser){
        userService.updateUser(upmsUser);
    }
    @DeleteMapping(value = "{userId}")
    public void update(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }
    @PostMapping(value = "")
    public void save(@RequestBody UpmsUser upmsUser){
        userService.saveUser(upmsUser);
    }
}
