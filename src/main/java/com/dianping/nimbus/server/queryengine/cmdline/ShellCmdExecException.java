package com.dianping.nimbus.server.queryengine.cmdline;

public class ShellCmdExecException extends Exception{

	private static final long serialVersionUID = -8346612025910475432L;
	
	public ShellCmdExecException(Throwable e){
		super(e);
	}
	
	public ShellCmdExecException(String e){
		super(e);
	}

}
