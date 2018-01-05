package rainJob.com.entity;

import java.util.List;

/**
 * 搜索城市的
 */
public class City extends BaseEntity {

    private String cityName;
    private List<City> sonCity;
    private City parentCity;

    public City getParentCity() {
        return parentCity;
    }

    public void setParentCity(City parentCity) {
        this.parentCity = parentCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<City> getSonCity() {
        return sonCity;
    }

    public void setSonCity(List<City> sonCity) {
        this.sonCity = sonCity;
    }
}
