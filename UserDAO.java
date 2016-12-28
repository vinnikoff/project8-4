

import java.util.*;

public class UserDAO extends AbstractDAOImpl{
    private List<User> list = new ArrayList<>();
    private List<User> list2 = new ArrayList<>();

    public User save(User user) {
        save(user);
        return user;
    }

    public void delete(User user) {
        delete(user);

    }

    public void deleteAll(List user) {

        user.clear();
    }


    public void saveAll(List User) {
        list2.addAll(User);
    }


    public List<User> getList(){
        return list;
    }


    public User get1(long id)
    {
        int idout=(int)id;
        User get=list.get(idout);
        return get;
    }

    public void deleteByld(long id) {
        for (int i=0; i<list.size(); i++)
        {
            User element= (User)list.get(i);

            if (element.getId()==id) list.remove(i);
        }

    }

}