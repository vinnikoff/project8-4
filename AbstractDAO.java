/**
 * Created by VINNI on 25.12.16.
 */
import java.util.*;

public interface AbstractDAO<T> {

    T save(T t);
    void delete(T t);
    void deleteAll(List T);
    void saveAll(List T);
    List<T> getList();
    void deleteByld(long id);
    T get(long id);

}
