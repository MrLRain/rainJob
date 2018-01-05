package rainJob.com.entity;


import java.util.List;

/**
 * @Author: xiaoyu
 * @Date: 17:26 2017/12/29
 * @Description:
 * @ModifyBy: 简历回复表
 */
public class Solutions  extends BaseEntity{

        private List<Delivery> deliveryList;

        private String message;

        private User user;

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
}
