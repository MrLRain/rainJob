package rainJob.com.util;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;
import rainJob.com.controller.vo.BaseEntityVo;
import rainJob.com.dto.ResponseMessage;
import rainJob.com.dto.Result;
import rainJob.com.util.dozer.BeanMapper;
import rainJob.com.util.supper.BaseController;
import rainJob.com.util.supper.BaseService;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class SpringBeanFactory<T, V extends BaseEntityVo,Dao extends JpaRepository<T,String>> implements BaseController<V> {
    public abstract BeanMapper getBeanMapper();
    public abstract BaseService<T,Dao> getService();
    public abstract Class<V> getVClass();
    public abstract Class<T> getTClass();

    @Override
    @GetMapping("/{ids}")
    public ResponseMessage<List<V>> idList(@PathVariable  String... ids) {
        try {
            Iterable<T> all = getService().findAll(Arrays.asList(ids));
            List<V> ts = getBeanMapper().mapList((Collection) all, getVClass());
            System.out.println("ts = " + ts);
            return Result.success(ts);
        } catch (Exception ex) {
            return Result.error();
        }
    }

    @Override
    public ResponseMessage<V> pageList(V vo) {
        return null;
    }

    @Override
    @PostMapping("/saveData")
    public ResponseMessage<V> saveData(@RequestBody V vo) {
        return getvResponseMessage(vo);
    }

    @Override
    @PutMapping("/updateData")
    public ResponseMessage<V> updateData(V vo) {
        return getvResponseMessage(vo);
    }

    @Override
    @DeleteMapping("/{vo}")
    public ResponseMessage<V> deleteData(@PathVariable V vo) {
        try {
            T entity = getBeanMapper().map(vo, getTClass());
            getService().delete(entity);
            return Result.success(vo);
        } catch (Exception ex) {
            return Result.error();
        }
    }

    private ResponseMessage<V> getvResponseMessage(V vo) {
        try {
            T entity = getBeanMapper().map(vo, getTClass());
            getService().save(entity);
            return Result.success(vo);
        } catch (Exception ex) {
            return Result.error();
        }
    }
}
