package rainJob.com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;

/**
 * @Author: xiaoyu
 * @Date: 10:21 2017/12/29
 * @Description:
 * @ModifyBy:
 */
<<<<<<< HEAD
=======
public class User extends BaseEntity {

    @Column(name = "sex",length = 2)
    private SexType sex;
    @Column(name ="username",length = 255,nullable = false)
    private String userName;
    @Column(name ="reality_name",length = 255,nullable = false)
    private String realityName;
    @Column(length = 26)
    private String password;
    @Column(length = 255)
    private String signature;
    @Column(name = "head_icon")
    private String headIcon;
    @Column(name="role_id")
    private String roleId;
    @Column(name="resume_id")
    private String resumeId;
    @Column
    private String eamil;
    @Column
    private String dimensionality;//维度
    @Column
    private String longitude;//精度

    public SexType getSex() {
        return sex;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String useName) {
        this.userName = useName;
    }

    public String getRealityName() {
        return realityName;
    }

    public void setRealityName(String realityName) {
        this.realityName = realityName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
>>>>>>> 43ed15514465f493ae6e479859a4ee069c75759c

@Entity
@Table(name = "user")
public class User extends BaseEntity {

}

