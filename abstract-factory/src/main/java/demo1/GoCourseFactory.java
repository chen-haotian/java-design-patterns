package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 20:53:17
 * @Version: 1.0.0
 * @Description: Go语言课程工厂
 */
public class GoCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new GoVideo();
    }

    @Override
    public Article getArticle() {
        return new GoArticle();
    }
}
