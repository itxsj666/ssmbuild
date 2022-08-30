import com.itxsj.pojo.Books;
import com.itxsj.service.BooksService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void Test(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksService = (BooksService) classPathXmlApplicationContext.getBean("booksSerivceimpl");
        List<Books> booksList = booksService.findAll();
        for (Books books : booksList) {
            System.out.println(books);
        }
    }
}
