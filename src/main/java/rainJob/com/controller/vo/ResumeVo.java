package rainJob.com.controller.vo;


public class ResumeVo	{
	private	String	resumeName;
	private	String	address;
	private	String	userId;


	 public	void	setResumeName(String	resumeName){
		this.resumeName=resumeName;
	}
	 public	String	getResumeName(){
		return	resumeName;
	}


	 public	void	setAddress(String	address){
		this.address=address;
	}
	 public	String	getAddress(){
		return	address;
	}


	 public	void	setUserId(String	userId){
		this.userId=userId;
	}
	 public	String	getUserId(){
		return	userId;
	}
}