package rainJob.com.controller.vo;

import	rainJob.com.entity.User;
import	rainJob.com.entity.EmploymentInformation;

public class DeliveryVo	{
	private	String	resumeId;
	private	EmploymentInformation	employmentInformation;
	private	User	user;


	 public	void	setResumeId(String	resumeId){
		this.resumeId=resumeId;
	}
	 public	String	getResumeId(){
		return	resumeId;
	}


	 public	void	setEmploymentInformation(EmploymentInformation	employmentInformation){
		this.employmentInformation=employmentInformation;
	}
	 public	EmploymentInformation	getEmploymentInformation(){
		return	employmentInformation;
	}


	 public	void	setUser(User	user){
		this.user=user;
	}
	 public	User	getUser(){
		return	user;
	}
}