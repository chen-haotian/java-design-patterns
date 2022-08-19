package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 20:47:20
 * @Version: 1.0.0
 * @Description: 课程工厂接口
 */
public interface CourseFactory {

    // 获取视频
    Video getVideo();

    // 获取文章
    Article getArticle();
}
