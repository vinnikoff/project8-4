
import java.util.*;

/**
 * Created by VINNI on 25.12.16.
 */
public class AbstractDAOImpl<T extends En> implements AbstractDAO<T> {

    private List<T> list = new ArrayList<>();
    private List<T> list2 = new ArrayList<>();

    @Override
    public T save(T t) {
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        list.remove(t);
        // System.out.println(list);
    }

    @Override
    public void deleteAll(List T) {
        //Iterator itr = T.iterator();
        //while (itr.hasNext()) {
        //  List element = (List) itr.next();
        //list.remove(element);
        // List<T> sublist = list.subList(0,list.size()); // Удаляем с 2 по 4й элемент включительно
        //list.removeAll(sublist);
        T.clear();
    }

    @Override
    public void saveAll(List T) {
        list2.addAll(T);
    }

    @Override
    public List<T> getList(){
        return list;
    }

    @Override
    public T get(long id)
    {
        int idout=(int)id;

        return list.get(idout);
    }

   /* public Integer getId(long id)
    {
        int idout=(int)id;
        Integer i=Integer.valueOf(idout);
        return i;
    }*/

    @Override
    public void deleteByld(long id) {
        for (int i=0; i<list.size(); i++)
        {
            T element= (T)list.get(i);

            if (element.getId()==id) list.remove(i);
        }

    }
}