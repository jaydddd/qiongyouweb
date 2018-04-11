package com.qianfeng.sw.service;

import com.qianfeng.sw.dto.SwUserDTO;

/**Author:wanggaiwei
 * Created by wanggaiwei on 2018/4/10.
 */
public interface ISwUserService {
    /**
     * 登录方法
     */
    SwUserDTO getUserLogin(String userPhone);
}
