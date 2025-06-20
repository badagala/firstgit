package com.gss.basics;

import java.io.IOException;

public class ShutdownLogoutRestartProgram {
	
	public void main(String args[]) {
		Runtime run=Runtime.getRuntime();
		
		try {
			run.exec("Shutdown /s");  //s for shutdown // /l for system lock   // /r for system restrat 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
