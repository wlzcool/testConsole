import com.zhiguogongfang.domain.User;
import org.apache.ibatis.session.SqlSession;

public class SelectTest {
    public static void main(String[] args) throws Exception {
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        Integer id = 1;
        User user = session.selectOne("com.zhiguogongfang.mapper.UserMapper.selectUser", 1);
        session.close();
        System.out.println(user.getName());
    }
}
