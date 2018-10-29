import com.zhiguogongfang.domain.User;
import org.apache.ibatis.session.SqlSession;

public class DeleteTest {
    public static void main(String[] args){
        SqlSession session =FKSqlSessionFactory.getSqlSession();
        session.delete("com.zhiguogongfang.mapper.UserMapper.deleteUser",12);
        session.commit();
        session.close();
    }
}


