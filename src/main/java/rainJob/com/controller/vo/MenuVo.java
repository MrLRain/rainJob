package rainJob.com.controller.vo;

import	rainJob.com.entity.Menu;
import	java.util.List;

public class MenuVo	{
	private	List<MenuVo>	sonMenu;
	private	String	leeway;
	private	String	menuName;
	private	String	userId;
	private	Menu	parentMenu;


	 public	void	setSonMenu(List<MenuVo>	sonMenu){
		this.sonMenu=sonMenu;
	}
	 public	List<MenuVo>	getSonMenu(){
		return	sonMenu;
	}


	 public	void	setLeeway(String	leeway){
		this.leeway=leeway;
	}
	 public	String	getLeeway(){
		return	leeway;
	}


	 public	void	setMenuName(String	menuName){
		this.menuName=menuName;
	}
	 public	String	getMenuName(){
		return	menuName;
	}


	 public	void	setUserId(String	userId){
		this.userId=userId;
	}
	 public	String	getUserId(){
		return	userId;
	}


	 public	void	setParentMenu(Menu	parentMenu){
		this.parentMenu=parentMenu;
	}
	 public	Menu	getParentMenu(){
		return	parentMenu;
	}
}