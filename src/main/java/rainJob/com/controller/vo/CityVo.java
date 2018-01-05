package rainJob.com.controller.vo;

import	java.util.List;
import	rainJob.com.entity.City;

public class CityVo	{
	private	String	cityName;
	private	City	parentCity;
	private	List<CityVo>	sonCity;


	 public	void	setCityName(String	cityName){
		this.cityName=cityName;
	}
	 public	String	getCityName(){
		return	cityName;
	}


	 public	void	setParentCity(City	parentCity){
		this.parentCity=parentCity;
	}
	 public	City	getParentCity(){
		return	parentCity;
	}


	 public	void	setSonCity(List<CityVo>	sonCity){
		this.sonCity=sonCity;
	}
	 public	List<CityVo>	getSonCity(){
		return	sonCity;
	}
}