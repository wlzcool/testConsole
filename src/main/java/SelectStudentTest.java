import com.zhiguogongfang.domain.SchoolClass;
import com.zhiguogongfang.domain.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SelectStudentTest {
    public static void main(String[] args) {
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        List<Student> classList = session.selectList
                ("com.zhiguogongfang.mapper.StudentMapper.selectStudentList");
        for (Student student : classList) {
            System.out.println(student.toString());
        }
        session.close();
    }
}
