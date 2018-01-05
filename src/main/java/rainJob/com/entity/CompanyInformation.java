package rainJob.com.entity;

import java.util.List;

import java.math.BigDecimal;

/**
 * @Author: xiaoyu
 * @Date: 17:13 2017/12/29
 * @Description: 公司信息
 * @ModifyBy:
 */
public class CompanyInformation extends BaseEntity {

    private String jobName;
    private City city;
    private JobGrade jobGrade;
    private String introduction;
    private BigDecimal peopleCount;
    private List<EmploymentInformation> employmentInformationList;


    public List<EmploymentInformation> getEmploymentInformationList() {
        return employmentInformationList;
    }

    public void setEmploymentInformationList(List<EmploymentInformation> employmentInformationList) {
        this.employmentInformationList = employmentInformationList;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public JobGrade getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(JobGrade jobGrade) {
        this.jobGrade = jobGrade;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public BigDecimal getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(BigDecimal peopleCount) {
        this.peopleCount = peopleCount;
    }
}
