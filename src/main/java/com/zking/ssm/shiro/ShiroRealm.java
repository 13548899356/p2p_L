package com.zking.ssm.shiro;


import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
//extends AuthorizingRealm
public class ShiroRealm {

  /*  @Autowired
    private sysUserService sysUserService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取token中的
        String username = principalCollection.getPrimaryPrincipal().toString();
        System.out.println(username);
        //根据username获取对应的角色及权限
        Set<String> permissions = sysUserService.findPermissions(username);
        Set<String> roles = sysUserService.findRoles(username);
        System.out.println(permissions+","+roles);

//        将用户和权限信息设置到SimpleAuthorizationInfo
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.setRoles(roles);
        info.setStringPermissions(permissions);
        System.out.println(roles);
        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = token.getPrincipal().toString();
        String password = token.getCredentials().toString();
//        根据用户名获取对应的用户信息
        sysUser user = sysUserService.userLogin(username);
        if (null == user) {
            throw new UnknownAccountException();
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
//                盐
                ByteSource.Util.bytes(user.getSalt()),
                this.getName()
        );

        return info;
    }*/
}
