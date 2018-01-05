package rainJob.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.web.PageableArgumentResolver;
import org.springframework.stereotype.Repository;


@Repository
public interface BaseDao extends JpaRepository,PageableArgumentResolver{

}
