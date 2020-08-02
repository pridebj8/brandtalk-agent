package com.humuson.imc.agent.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.humuson.imc.agent.model.ImcBtCampaign;

public class ImcBtCampaignRowMapper implements RowMapper<ImcBtCampaign> {

	@Override
	public ImcBtCampaign mapRow(ResultSet rs, int rowNum) throws SQLException {
		ImcBtCampaign imcBtCampaign = new ImcBtCampaign();

		imcBtCampaign.setId(rs.getLong("id"));
		imcBtCampaign.setStatus(rs.getString("status"));
		imcBtCampaign.setSenderKey(rs.getString("sender_key"));
		imcBtCampaign.setTemplateCode(rs.getString("template_code"));
		imcBtCampaign.setMessageType(rs.getString("message_type"));
		imcBtCampaign.setReservedDate(rs.getString("reserved_date"));
		imcBtCampaign.setRequestTimeout(rs.getInt("request_timeout"));
		imcBtCampaign.setResendMtType(rs.getString("resend_mt_type"));
		imcBtCampaign.setResendMtTitle(rs.getString("resend_mt_title"));
		imcBtCampaign.setResendMtMessage(rs.getString("resend_mt_message"));
		imcBtCampaign.setResendMtMessageResue(rs.getString("resend_mt_message_resue"));
		imcBtCampaign.setResendMtFrom(rs.getString("resend_mt_from"));
		imcBtCampaign.setAttachFile01(rs.getString("attach_file_01"));
		imcBtCampaign.setAttachFile02(rs.getString("attach_file_02"));
		imcBtCampaign.setAttachFile03(rs.getString("attach_file_03"));
		imcBtCampaign.setCreatedAt(rs.getString("created_at"));
		imcBtCampaign.setModifiedAt(rs.getString("modified_at"));

		return imcBtCampaign;
	}

}
