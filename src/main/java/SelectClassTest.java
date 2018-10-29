import com.zhiguogongfang.domain.SchoolClass;
import com.zhiguogongfang.domain.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SelectClassTest {
    public static void main(String[] args) {
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        List<SchoolClass> classList = session.selectList
                ("com.zhiguogongfang.mapper.SchoolClassMapper.selectClassById",2);
        for (SchoolClass schoolClass : classList) {
            System.out.println(schoolClass.toString());
            List<Student> studentList = schoolClass.getStudents();
            for (Student s : studentList) {
                System.out.println(s.toString());
            }
        }
        session.close();
    }
}
