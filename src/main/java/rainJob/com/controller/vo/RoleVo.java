package rainJob.com.controller.vo;

import	rainJob.com.util.enumCodes.GradeEnum;

public class RoleVo	{
	private	String	role;
	private	GradeEnum	grade;
	private	String	roleName;
	private	String	leeway;


	 public	void	setRole(String	role){
		this.role=role;
	}
	 public	String	getRole(){
		return	role;
	}


	 public	void	setGrade(GradeEnum	grade){
		this.grade=grade;
	}
	 public	GradeEnum	getGrade(){
		return	grade;
	}


	 public	void	setRoleName(String	roleName){
		this.roleName=roleName;
	}
	 public	String	getRoleName(){
		return	roleName;
	}


	 public	void	setLeeway(String	leeway){
		this.leeway=leeway;
	}
	 public	String	getLeeway(){
		return	leeway;
	}
}