package com.xworkz.app.java;

public class Runtime {
	private String method;
	private boolean execution;

	public Runtime() {
	}

	public Runtime(String method) {
		super();
		this.method = method;
	}

	public Runtime(String method, boolean execution) {
		super();
		this.method = method;
		this.execution = execution;
	}

}
