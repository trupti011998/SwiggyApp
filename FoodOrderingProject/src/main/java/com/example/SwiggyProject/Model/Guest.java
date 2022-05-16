package com.example.SwiggyProject.Model;

public class Guest {

	private long guestId;
	private String guestName;
	private String guestEmail;
	private String guestAddress;
	private String guestPhoneNo;
	
	public Guest() {
	}

	public Guest(long guestId, String guestName, String guestEmail, String guestAddress, String guestPhoneNo) {
		this.guestId = guestId;
		this.guestName = guestName;
		this.guestEmail = guestEmail;
		this.guestAddress = guestAddress;
		this.guestPhoneNo = guestPhoneNo;
	}

	public long getGuestId() {
		return guestId;
	}

	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	public String getGuestAddress() {
		return guestAddress;
	}

	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}

	public String getGuestPhoneNo() {
		return guestPhoneNo;
	}

	public void setGuestPhoneNo(String guestPhoneNo) {
		this.guestPhoneNo = guestPhoneNo;
	}
	
	
}
