package com.qianfeng.sw.test;

import com.qianfeng.sw.dto.SwUserDTO;
import com.qianfeng.sw.service.ISwUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**Author:wanggaiwei
 * Created by admin on 2018/4/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-core.xml")
public class SwUserTest {
    private static final Logger logger=Logger.getLogger(SwUserTest.class);

    @Autowired
    private ISwUserService swUserService;

    /**
     * 单元测试登录方法
     */
    @Test
    public void getuserLogin(){
        SwUserDTO userLogin = swUserService.getUserLogin("1240029870");
        if(logger.isInfoEnabled()){
            logger.info(userLogin.getUserSalt());
        }

    }

}
