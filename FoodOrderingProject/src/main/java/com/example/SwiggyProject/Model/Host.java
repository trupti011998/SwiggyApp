package com.example.SwiggyProject.Model;

public class Host {

	private long hostId;
	private String hostName;
	private String hostEmail;
	private String hostAddress;
	private String hostPhoneno;
	
	public Host() {
		
	}

	public Host(long hostId, String hostName, String hostEmail, String hostAddress, String hostPhoneno) {
		this.hostId = hostId;
		this.hostName = hostName;
		this.hostEmail = hostEmail;
		this.hostAddress = hostAddress;
		this.hostPhoneno = hostPhoneno;
	}

	public long getHostId() {
		return hostId;
	}

	public void setHostId(long hostId) {
		this.hostId = hostId;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getHostEmail() {
		return hostEmail;
	}

	public void setHostEmail(String hostEmail) {
		this.hostEmail = hostEmail;
	}

	public String getHostAddress() {
		return hostAddress;
	}

	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}

	public String getHostPhoneno() {
		return hostPhoneno;
	}

	public void setHostPhoneno(String hostPhoneno) {
		this.hostPhoneno = hostPhoneno;
	}
	
	
	
	
}
