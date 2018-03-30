package rainJob.com.entity;


import org.springframework.data.annotation.Transient;

import javax.persistence.Column;
import java.util.List;

/**
 * @Author: xiaoyu
 * @Date: 17:26 2017/12/29
 * @Description:
 * @ModifyBy: 简历回复表
 */
public class Solutions extends BaseEntity {
    @Transient
    private List<Delivery> deliveryList;
    @Column(length = 36)
    private String deliveryId;
    @Column
    private String message;
    @Transient
    private User user;
    @Column(name = "user_id", length = 36)
    private String userId;

    public List<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
