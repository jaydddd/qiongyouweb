package com.qianfeng.sw.service.impl;

import com.qianfeng.sw.dao.ISwUserDAO;
import com.qianfeng.sw.dto.SwUserDTO;
import com.qianfeng.sw.service.ISwUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**Author:wanggaiwei
 * Created by wanggaiwei on 2018/4/10.
 */
@Service
@Transactional
public class SwUserService implements ISwUserService{
    @Autowired
    private ISwUserDAO swUserDAO;

    /**
     * 登录的方法
     * @param userPhone
     * @return SwUserDTO
     */
    @Override
    public SwUserDTO getUserLogin(String userPhone) {
        return swUserDAO.getUserLogin(userPhone);
    }
}
