package rainJob.com.controller.vo;

import	java.util.List;
import	rainJob.com.entity.JobGrade;

public class JobGradeVo	{
	private	String	gradeName;
	private	JobGrade	parentGrades;
	private	List<JobGradeVo>	jobGrades;


	 public	void	setGradeName(String	gradeName){
		this.gradeName=gradeName;
	}
	 public	String	getGradeName(){
		return	gradeName;
	}


	 public	void	setParentGrades(JobGrade	parentGrades){
		this.parentGrades=parentGrades;
	}
	 public	JobGrade	getParentGrades(){
		return	parentGrades;
	}


	 public	void	setJobGrades(List<JobGradeVo>	jobGrades){
		this.jobGrades=jobGrades;
	}
	 public	List<JobGradeVo>	getJobGrades(){
		return	jobGrades;
	}
}