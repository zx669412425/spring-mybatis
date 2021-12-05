import com.zx.spring.mybatis.StudentService;
import com.zx.spring.mybatis.StudentServiceImpl;
import com.zx.spring.mybatis.mapper.StudentInfoMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @title: Main
 * @Author zx
 * @Date: 2021/11/7/0007 20:35
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        ApplicationContext apl = new ClassPathXmlApplicationContext("classpath:/spring/application.xml");

        StudentInfoMapper bean = apl.getBean(StudentInfoMapper.class);
        System.out.println(bean);

        StudentService bean1 = apl.getBean(StudentServiceImpl.class);
        System.out.println(bean1);

        System.out.println("===========");

    }

}
