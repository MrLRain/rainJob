package rainJob.com.entity;

import rainJob.com.util.enumCodes.GradeEnum;

public class Role extends BaseEntity {

        public String roleName;
        public GradeEnum grade;
        public String role;
        public String leeway;

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
