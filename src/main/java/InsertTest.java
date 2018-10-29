import com.zhiguogongfang.domain.User;
import org.apache.ibatis.session.SqlSession;


public class InsertTest {
    public static void main (String[] args) throws Exception{
        SqlSession session =FKSqlSessionFactory.getSqlSession();
        User user =new User("jack",12,"男");
        session.insert("com.zhiguogongfang.mapper.UserMapper.save",user);
        session.commit();
        session.close();
    }
}
