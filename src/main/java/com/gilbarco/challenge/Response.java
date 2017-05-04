package com.gilbarco.challenge;

public class Response {
	
	private String timestamp ;
	private int counter;
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public int getCounter() {
		return counter;
	}
	public Response(String timestamp, int counter) {
		super();
		this.timestamp = timestamp;
		this.counter = counter;
	}
	@Override
	public String toString() {
		return "CountAndTime [timestamp=" + timestamp + ", counter=" + counter + ", toString()=" + super.toString()
				+ "]";
	}

}
