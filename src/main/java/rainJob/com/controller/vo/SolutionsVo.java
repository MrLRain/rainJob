package rainJob.com.controller.vo;

import	java.util.List;
import	rainJob.com.entity.User;

public class SolutionsVo	{
	private	List<DeliveryVo>	deliveryList;
	private	String	message;
	private	User	user;


	 public	void	setDeliveryList(List<DeliveryVo>	deliveryList){
		this.deliveryList=deliveryList;
	}
	 public	List<DeliveryVo>	getDeliveryList(){
		return	deliveryList;
	}


	 public	void	setMessage(String	message){
		this.message=message;
	}
	 public	String	getMessage(){
		return	message;
	}


	 public	void	setUser(User	user){
		this.user=user;
	}
	 public	User	getUser(){
		return	user;
	}
}