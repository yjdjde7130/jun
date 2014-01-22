package com.junapp.servlet;

public class Test1 {

	static int aclState = 0;

	public static void main(String[] args) {

		int tmp = 1;

		// tmp的二进制形式向左移动permission个单位
		// 这样经过移动的结果会有四种情况: C:0001 R:0010 U:0100 D:1000
		tmp = tmp << 1;
		System.out.println(tmp);
		if (true) {
			// 如果是授权,则把原有的权限与当前的权限相加,二进制用"|"
			aclState |= tmp;
			System.out.println(aclState);
		} else {
			// 如果是减去授权,则当前传进来的权限取反,再与原有的权限"&"
			aclState &= ~tmp;
		}
	}

	public void setPermission(int permission, boolean yes) {
		int tmp = 1;
		int aclState = 0;
		// tmp的二进制形式向左移动permission个单位
		// 这样经过移动的结果会有四种情况: C:0001 R:0010 U:0100 D:1000
		tmp = tmp << permission;
		if (yes) {
			// 如果是授权,则把原有的权限与当前的权限相加,二进制用"|"
			aclState |= tmp;
		} else {
			// 如果是减去授权,则当前传进来的权限取反,再与原有的权限"&"
			aclState &= ~tmp;
		}
	}
}
