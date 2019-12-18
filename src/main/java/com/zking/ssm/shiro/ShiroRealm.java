package com.zking.ssm.shiro;


import com.zking.ssm.model.sysUser;
import com.zking.ssm.services.ISysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
//extends AuthorizingRealm
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private ISysUserService sysUserService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取token中的

        System.out.println("获取token中的");
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("认证");

        String username = token.getPrincipal().toString();
        String password = token.getCredentials().toString();
        sysUser user=new sysUser();
        user.setUname(username);
        user.setPassword(password);
//        根据用户名获取对应的用户信息
        sysUser users = sysUserService.getUser(user);
        if (null == users) {
            throw new UnknownAccountException();
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
                users.getUname(),
                users.getPassword(),
//                盐
                ByteSource.Util.bytes(users.getSalt()),
                this.getName()
        );

        return info;
    }
}
