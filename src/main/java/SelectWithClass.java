import com.zhiguogongfang.domain.User;
import com.zhiguogongfang.mapper.UserMapper2;
import org.apache.ibatis.session.SqlSession;

public class SelectWithClass {
    public static void main(String[] args) throws Exception {
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        Integer id = 1;
        UserMapper2 userMapper =session.getMapper(UserMapper2.class);
        User user =userMapper.selectUserById(id);
        session.close();
        System.out.println(user.getName());
    }
}


