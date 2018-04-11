package com.qianfeng.sw.dao.impl;

import com.qianfeng.sw.dao.ISwUserDAO;
import com.qianfeng.sw.dto.SwUserDTO;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**Author:wanggaiwei
 * Created by admin on 2018/4/10.
 */
@Repository
public class SwUserDAO implements ISwUserDAO {
    @Autowired
     private SqlSession sqlSession;
    /**
     * 登录的方法
     * @param userPhone
     * @return SwUserDTO
     */
    @Override
    public SwUserDTO getUserLogin(String userPhone) {

        SwUserDTO swUserDTO = sqlSession.selectOne("com.qianfeng.sw.swuser.uservalue",userPhone);
        return swUserDTO;
    }
}
