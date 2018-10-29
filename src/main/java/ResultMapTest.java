import com.zhiguogongfang.domain.SchoolClass;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ResultMapTest {
    public static void main(String[] args){
        SqlSession session =FKSqlSessionFactory.getSqlSession();
        List<SchoolClass> classList =session.selectList
                ("com.zhiguogongfang.mapper.SchoolClassMapper.selectClassList");
        for(SchoolClass schoolClass:classList){
            System.out.println(schoolClass.toString());
        }
        session.close();
    }
}
