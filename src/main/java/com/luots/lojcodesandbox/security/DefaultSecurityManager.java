package com.luots.lojcodesandbox.security;

import java.security.Permission;

public class DefaultSecurityManager extends SecurityManager{
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何限制");
        System.out.println(perm);
        super.checkPermission(perm);
    }
}
