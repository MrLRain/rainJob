package rainJob.com.controller.vo;

import	rainJob.com.entity.User;
import	rainJob.com.util.enumCodes.YesOrNo;
import	rainJob.com.entity.CompanyInformation;

public class EmploymentInformationVo	{
	private	CompanyInformation	companyInformation;
	private	String	companyName;
	private	String	empName;
	private	YesOrNo	stick;
	private	String	salary;
	private	String	workAddress;
	private	User	user;


	 public	void	setCompanyInformation(CompanyInformation	companyInformation){
		this.companyInformation=companyInformation;
	}
	 public	CompanyInformation	getCompanyInformation(){
		return	companyInformation;
	}


	 public	void	setCompanyName(String	companyName){
		this.companyName=companyName;
	}
	 public	String	getCompanyName(){
		return	companyName;
	}


	 public	void	setEmpName(String	empName){
		this.empName=empName;
	}
	 public	String	getEmpName(){
		return	empName;
	}


	 public	void	setStick(YesOrNo	stick){
		this.stick=stick;
	}
	 public	YesOrNo	getStick(){
		return	stick;
	}


	 public	void	setSalary(String	salary){
		this.salary=salary;
	}
	 public	String	getSalary(){
		return	salary;
	}


	 public	void	setWorkAddress(String	workAddress){
		this.workAddress=workAddress;
	}
	 public	String	getWorkAddress(){
		return	workAddress;
	}


	 public	void	setUser(User	user){
		this.user=user;
	}
	 public	User	getUser(){
		return	user;
	}
}