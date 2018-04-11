package com.qianfeng.sw.realm;


import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


/**shiro 的登录注册,权限代码
 * Author:wanggaiwei
 * Created by wanggaiwei on 2018/4/11.
 */
public class UserRealm  extends AuthorizingRealm{

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }



    /**Author:wanggaiwei
     * 进行登录操作的方法
     * @param
     * @return AuthenticationInfo
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken  usernamePasswordToken= (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        char[] password = usernamePasswordToken.getPassword();
        String passwordStr = new String(password, 0, password.length);
        if(StringUtils.equalsIgnoreCase(username,null)||StringUtils.equalsIgnoreCase(username,"")){

        }
        return null;
    }
}
