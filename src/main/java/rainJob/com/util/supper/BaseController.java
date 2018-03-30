package rainJob.com.util.supper;

import rainJob.com.dto.ResponseMessage;

import java.util.List;

public interface BaseController<V> {


    ResponseMessage<List<V>> idList(String... ids);

    ResponseMessage<V> pageList(V vo);

    ResponseMessage<V> saveData(V vo);

    ResponseMessage<V> updateData(V vo);

    ResponseMessage<V> deleteData(V vo);
}
