package com.jony.dao;

import com.jony.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    // 插入数据
    int addBlog(Blog blog);

    // 条件查找
    List<Blog> getBlogIf(Map map);

    // 条件查找
    List<Blog> getBlogWhere(Map map);

    // 条件查找
    List<Blog> getBlogChoose(Map map);

    // 更新博客
    int updateBlog(Map map);
}
