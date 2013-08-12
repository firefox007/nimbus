package com.dianping.nimbus.client.service;

import com.dianping.nimbus.client.bo.LoginTokenBo;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/Login")
public interface LoginService extends RemoteService {

	Boolean isAuthenticated(String tokenid);

	LoginTokenBo authenticate(String username, String password);

	Boolean logout(String tokenid);

}
