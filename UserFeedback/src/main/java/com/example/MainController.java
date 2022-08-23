package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private FeedbackDao dao;
	@PostMapping("/feedback")
	public String userRegister(@RequestParam("name") String name,  @RequestParam("email") String email , @RequestParam("feedback") String feedback) {
	FeedbackEntity feedbackobj = new FeedbackEntity(name,email,feedback);
	int data= dao.addFeedback(feedbackobj);
	if(data>0) {
		return "Feedback inserted succesfully!";
	}
	else {
		return "Error in adding the feedback";
	}
		
	}
	
//@RequestMapping(value="/feedback",method=RequestMethod.POST)
	/*@PostMapping("/feedback")
	public ResponseEntity<String> addFeedback(@RequestBody FeedbackEntity feedback) {
		
		int x=dao.addFeedback(feedback);
		if(x>0)
			return new ResponseEntity<String>("Feedback inserted",HttpStatus.OK);
		else
			return new ResponseEntity<String>("Error in inserting feedback",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}*/
}