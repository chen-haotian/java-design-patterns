package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 20:51:04
 * @Version: 1.0.0
 * @Description: Java语言课程工厂
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
