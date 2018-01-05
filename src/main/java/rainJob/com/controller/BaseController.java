package rainJob.com.controller;

import org.springframework.web.bind.annotation.RestController;
import rainJob.com.dto.ResponseMessage;

@RestController
public abstract class BaseController<V> {

        
    public abstract ResponseMessage<V> idList(String... ids);

    public abstract ResponseMessage<V> pageList(V vo);

    public abstract ResponseMessage<V> saveData(V vo);

    public abstract ResponseMessage<V> updateData(V vo);

    public abstract ResponseMessage<V> deleteData(V vo);
}
