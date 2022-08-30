import com.itxsj.pojo.Books;
import com.itxsj.service.BooksService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Random;

public class MyTest {
    @Test
    public void Test() {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksService = (BooksService) classPathXmlApplicationContext.getBean("booksSerivceimpl");
        List<Books> booksList = booksService.findAll();
        for (Books books : booksList) {
            System.out.println(books);
        }
    }

    @Test
    public void LotteryDemo() {
        int[] lottery = creatNumber();

        for (int i : lottery) {
            System.out.print(i + "\t");
        }
    }

    public static int[] creatNumber() {
        //创建数组
        int[] arr = new int[7];
        //生成随机数
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            //获取随机数
            int redNumber = r.nextInt(33) + 1;
            boolean flag = conains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        //生成蓝色随机数
        int blueNumber = r.nextInt(16) + 1;
        arr[6] = blueNumber;

        return arr;
    }

    public static boolean conains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}

