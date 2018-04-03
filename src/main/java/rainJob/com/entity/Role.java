package rainJob.com.entity;

import rainJob.com.util.enumCodes.GradeEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role extends BaseEntity {

        @Column(length = 36,name = "role_name")
        private String roleName;
        @Column(length = 2)
        private GradeEnum grade;
        @Column
        private String role;
        @Column
        private String leeway;

        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public GradeEnum getGrade() {
            return grade;
        }

        public void setGrade(GradeEnum grade) {
            this.grade = grade;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getLeeway() {
            return leeway;
        }

        public void setLeeway(String leeway) {
            this.leeway = leeway;
        }
}
