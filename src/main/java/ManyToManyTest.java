import com.zhiguogongfang.domain.Attribute;
import com.zhiguogongfang.domain.University;
import com.zhiguogongfang.domain.UniversityAttribute;
import com.zhiguogongfang.mapper.UniversityMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ManyToManyTest {
    public static void main(String[] args) throws Exception {
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        UniversityMapper mapper = session.getMapper(UniversityMapper.class);
        List<University> universities = mapper.selectUniversityAttribute();
        for (University item : universities) {
            System.out.println(item.toString());
            List<Attribute> attributes = item.getAttributes();
            for (Attribute ele : attributes) {
                System.out.println(ele.toString());
            }
        }
        UniversityAttribute ua =new UniversityAttribute();
        University u =new University();
        u.setId(1);
        Attribute a =new Attribute();
        a.setId(2);
        ua.setUniversity(u);
        ua.setAttribute(a);
        mapper.deleteUniversityAttribute(ua);
        session.commit();
        session.close();

    }
}


