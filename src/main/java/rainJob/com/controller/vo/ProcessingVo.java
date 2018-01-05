package rainJob.com.controller.vo;

import	rainJob.com.entity.User;

public class ProcessingVo	{
	private	Object	interviewCommentsId;
	private	User	user;


	 public	void	setInterviewCommentsId(Object	interviewCommentsId){
		this.interviewCommentsId=interviewCommentsId;
	}
	 public	Object	getInterviewCommentsId(){
		return	interviewCommentsId;
	}


	 public	void	setUser(User	user){
		this.user=user;
	}
	 public	User	getUser(){
		return	user;
	}
}