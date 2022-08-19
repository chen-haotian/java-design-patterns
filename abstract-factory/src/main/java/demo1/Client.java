package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 20:55:26
 * @Version: 1.0.0
 * @Description: 客户端（使用方或者称为调用方）
 */
public class Client {
    public static void main(String[] args) {
        // Java
        // CourseFactory courseFactory = new JavaCourseFactory();
        // Go
        CourseFactory courseFactory = new GoCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
