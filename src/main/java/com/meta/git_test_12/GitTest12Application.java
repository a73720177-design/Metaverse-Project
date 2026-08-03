package com.meta.git_test_12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTest12Application {

    public static void main(String[] args) {
        SpringApplication.run(GitTest12Application.class, args);
      System.out.printf(" 안녕하세요");  
      System.out.println("브랜치 생성 완료");
    }

}
