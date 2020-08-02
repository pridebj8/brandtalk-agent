package com.humuson.imc.agent.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.humuson.imc.agent.model.ImcBtList;

public class ImcBtListRowMapper implements RowMapper<ImcBtList>{
	
	@Override
	public ImcBtList mapRow(ResultSet rs, int rowNum) throws SQLException {
		ImcBtList imcBtList = new ImcBtList();

		imcBtList.setId(rs.getLong("id"));
		imcBtList.setCampaignId(rs.getLong("campaign_id"));
		imcBtList.setStatus(rs.getString("status"));
		imcBtList.setPhoneNumnber(rs.getString("phone_number"));
		imcBtList.setBillCode(rs.getString("bill_code"));
		imcBtList.setSenderCode(rs.getString("sender_code"));
		imcBtList.setMessageVariable(rs.getString("message_variable"));
		imcBtList.setButtonVariable(rs.getString("button_variable"));
		imcBtList.setRequestUid(rs.getString("request_uid"));
		imcBtList.setRequestDate(rs.getString("request_date"));
		imcBtList.setResponseCode(rs.getString("response_code"));
		imcBtList.setReportCode(rs.getString("report_code"));
		imcBtList.setReportDate(rs.getString("report_date"));
		imcBtList.setReportType(rs.getString("report_type"));
		imcBtList.setArrivalDate(rs.getString("arrival_date"));
		imcBtList.setResendReportCode(rs.getString("resend_report_code"));
		imcBtList.setResendReportDate(rs.getString("resend_report_date"));
		imcBtList.setResendReportType(rs.getString("resend_report_type"));
		imcBtList.setResendArrivalDate(rs.getString("resend_arrival_date"));
		imcBtList.setEtc1(rs.getString("etc1"));
		imcBtList.setEtc2(rs.getString("etc2"));
		imcBtList.setEtc3(rs.getString("etc3"));
		imcBtList.setEtc4(rs.getString("etc4"));
		imcBtList.setEtc5(rs.getString("etc5"));
		imcBtList.setCreateAt(rs.getString("created_at"));
		imcBtList.setProcessStat(rs.getString("process_stat"));

		return imcBtList;
	}

}
