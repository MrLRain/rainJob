package rainJob.com.entity;

import rainJob.com.util.enumCodes.YesOrNo;
/**
 * @Author: xiaoyu
 * @Date: 17:11 2017/12/29
 * @Description: 展示职业介绍记录
 * @ModifyBy:
 */
public class EmploymentInformation extends BaseEntity{

    private String companyName;//公司名称
    private String empName;//职位名称
    private String workAddress;
    private String salary;//薪水
    private User user; //招聘者
    private YesOrNo stick;
    private CompanyInformation companyInformation;


    public CompanyInformation getCompanyInformation() {
        return companyInformation;
    }

    public void setCompanyInformation(CompanyInformation companyInformation) {
        this.companyInformation = companyInformation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public YesOrNo getStick() {
        return stick;
    }

    public void setStick(YesOrNo stick) {
        this.stick = stick;
    }
}
