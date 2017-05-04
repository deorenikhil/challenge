package com.gilbarco.challenge;

public class Response {
	
	private String timestamp ;
	private int calls;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getCalls() {
		return calls;
	}

	public void setCalls(int calls) {
		this.calls = calls;
	}

	public Response(String timestamp, int calls) {
		super();
		this.timestamp = timestamp;
		this.calls = calls;
	}
	

}
