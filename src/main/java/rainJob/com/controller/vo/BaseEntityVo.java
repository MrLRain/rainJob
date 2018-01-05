package rainJob.com.controller.vo;

import	java.util.Date;
import	java.util.Date;

public class BaseEntityVo	{
	private	Date	updateDate;
	private	String	id;
	private	Date	createDate;


	 public	void	setUpdateDate(Date	updateDate){
		this.updateDate=updateDate;
	}
	 public	Date	getUpdateDate(){
		return	updateDate;
	}


	 public	void	setId(String	id){
		this.id=id;
	}
	 public	String	getId(){
		return	id;
	}


	 public	void	setCreateDate(Date	createDate){
		this.createDate=createDate;
	}
	 public	Date	getCreateDate(){
		return	createDate;
	}
}