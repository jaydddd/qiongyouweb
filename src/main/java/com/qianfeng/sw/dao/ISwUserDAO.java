package com.qianfeng.sw.dao;

import com.qianfeng.sw.dto.SwUserDTO;

/**Author:wanggaiwei
 * Created by wanggaiwei on 2018/4/10.
 */
public interface ISwUserDAO {

    /**
     * 登录方法
     */
    SwUserDTO getUserLogin(String userPhone);

}
