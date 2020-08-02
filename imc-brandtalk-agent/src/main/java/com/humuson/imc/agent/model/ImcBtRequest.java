package com.humuson.imc.agent.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ImcBtRequest {

	private long id;

	private String requestUid;

	private int retryCount;

	private String requestAt;

	private String createdAt;

	private String modifiedAt;

	private String reportYn;

	@Override
	public String toString() {
		return "ImcBtRequest [id=" + id + ", requestUid=" + requestUid + ", retryCount=" + retryCount + ", requestAt="
				+ requestAt + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + ", reportYn=" + reportYn + "]";
	}
	
}
