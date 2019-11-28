package com.jony.utils;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
  private static SqlSessionFactory sqlSessionFactory = null;

  static {
    // 获取 sqlSessionFactory
    String resource = "mybatis-config.xml";
    InputStream inputStream = null;
    try {
      inputStream = Resources.getResourceAsStream(resource);
    } catch (IOException e) {
      e.printStackTrace();
    }
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  }

  public static SqlSession getSqlSessionFactory() {
    return sqlSessionFactory.openSession();
  }
}
