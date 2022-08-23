package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FeedbackDao {

	@Autowired
	private JdbcTemplate template;
	
	public int addFeedback(FeedbackEntity feedback) {
		
		return template.update("insert into feedback (name,email,feedback) values (?,?,?)", 
				feedback.getName(),feedback.getEmail(),feedback.getFeedback());
	}
	
}