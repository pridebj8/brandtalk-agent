package com.humuson.imc.agent.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ImcBtListLog {

	private long id;

	private long campaignId;

	private String status;

	private String phoneNumnber;

	private String billCode;

	private String senderCode;

	private String requestUid;

	private String requestDate;

	private String responseCode;

	private String reportCode;

	private String reportDate;

	private String reportType;

	private String arrivalDate;

	private String resendReportCode;

	private String resendReportDate;

	private String resendReportType;

	private String resendArrivalDate;

	private String etc1;

	private String etc2;

	private String etc3;

	private String etc4;

	private String etc5;

	@Override
	public String toString() {
		return "ImcBtListLog [id=" + id + ", campaignId=" + campaignId + ", status=" + status + ", phoneNumnber="
				+ phoneNumnber + ", billCode=" + billCode + ", senderCode=" + senderCode + ", etc1=" + etc1 + ", etc2="
				+ etc2 + ", etc3=" + etc3 + ", etc4=" + etc4 + ", etc5=" + etc5 + "]";
	}

}
