import com.zhiguogongfang.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class SelectMapTest {
    public static void main(String[] args) throws Exception {
        SqlSession session = FKSqlSessionFactory.getSqlSession();

        List<Map<String, Object>> userMapList = session.selectList("com.zhiguogongfang.mapper.UserMapper.selectUserMap");
        session.close();
        for (Map<String, Object> user : userMapList) {
            System.out.println(user.toString());
        }
        session.close();
    }
}


