package rainJob.com.entity;

import javax.persistence.Column;
import javax.persistence.Transient;
import java.util.List;

/**
 * 搜索城市的
 */
public class City extends BaseEntity {

    @Column(name = "city_name")
    private String cityName;
    @Column(name = "city_id", length = 36)
    private String cityId;
    @Transient
    private List<City> sonCity;
    @Transient
    private City parentCity;


    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

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
