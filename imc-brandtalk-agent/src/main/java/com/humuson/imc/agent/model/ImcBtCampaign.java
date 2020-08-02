package com.humuson.imc.agent.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ImcBtCampaign {
	
	private long id;
	
	private String status;
	
	private String senderKey;
	
	private String templateCode;
	
	private String messageType;
	
	private String reservedDate;
	
	private int requestTimeout;
	
	private String resendMtType;
	
	private String resendMtTitle;
	
	private String resendMtMessage;
	
	private String resendMtMessageResue;
	
	private String resendMtFrom;
	
	private String attachFile01;
	
	private String attachFile02;
	
	private String attachFile03;
	
	private String createdAt;
	
	private String modifiedAt;

	@Override
	public String toString() {
		return "ImcBtCampaign [id=" + id + ", status=" + status + ", senderKey=" + senderKey + ", templateCode="
				+ templateCode + ", messageType=" + messageType + ", reservedDate=" + reservedDate + ", expireDate="
				+ requestTimeout + ", createdAt=" + createdAt + "]";
	}

}
