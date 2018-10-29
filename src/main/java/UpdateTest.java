import com.zhiguogongfang.domain.User;
import org.apache.ibatis.session.SqlSession;

public class UpdateTest {
    public static void main(String[] args){
        SqlSession session =FKSqlSessionFactory.getSqlSession();
        User user =session.selectOne("com.zhiguogongfang.mapper.UserMapper.selectUser",1);
        user.setName("test");
        session.update("com.zhiguogongfang.mapper.UserMapper.updateUser",user);
        session.commit();
        session.close();
    }
}
