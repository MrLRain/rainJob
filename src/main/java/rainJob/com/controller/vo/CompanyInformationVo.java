package rainJob.com.controller.vo;

import	rainJob.com.entity.City;
import	rainJob.com.entity.JobGrade;
import	java.math.BigDecimal;
import	java.util.List;

public class CompanyInformationVo	{
	private	String	jobName;
	private	JobGrade	jobGrade;
	private	List<EmploymentInformationVo>	employmentInformationList;
	private	City	city;
	private	BigDecimal	peopleCount;
	private	String	introduction;


	 public	void	setJobName(String	jobName){
		this.jobName=jobName;
	}
	 public	String	getJobName(){
		return	jobName;
	}


	 public	void	setJobGrade(JobGrade	jobGrade){
		this.jobGrade=jobGrade;
	}
	 public	JobGrade	getJobGrade(){
		return	jobGrade;
	}


	 public	void	setEmploymentInformationList(List<EmploymentInformationVo>	employmentInformationList){
		this.employmentInformationList=employmentInformationList;
	}
	 public	List<EmploymentInformationVo>	getEmploymentInformationList(){
		return	employmentInformationList;
	}


	 public	void	setCity(City	city){
		this.city=city;
	}
	 public	City	getCity(){
		return	city;
	}


	 public	void	setPeopleCount(BigDecimal	peopleCount){
		this.peopleCount=peopleCount;
	}
	 public	BigDecimal	getPeopleCount(){
		return	peopleCount;
	}


	 public	void	setIntroduction(String	introduction){
		this.introduction=introduction;
	}
	 public	String	getIntroduction(){
		return	introduction;
	}
}