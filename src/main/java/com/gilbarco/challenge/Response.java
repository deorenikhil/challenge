package com.gilbarco.challenge;

public class Response {
	
	private String timestamp ;
	private int calls;
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public void setCounter(int counter) {
		this.calls = counter;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public int getCounter() {
		return calls;
	}
	public Response(String timestamp, int counter) {
		super();
		this.timestamp = timestamp;
		this.calls = counter;
	}
	

}
