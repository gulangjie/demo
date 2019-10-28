package com.example.demo.dao.impl;

import com.example.demo.DemoApplication;
import com.example.demo.dao.AuthorDao;
import com.example.demo.pojo.Author;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class AuthorDaoImplTest {

    @Autowired
    private AuthorDao authorDao;

    @Test
    public void add() {
        Author author = new Author();
        author.setId(2L);
        author.setNickName("GuLangJie");
        author.setRealName("CaiLeiJie");

        authorDao.add(author);

        System.out.println("插入成功");

    }


    @Test
    public void update() {
        Author author = new Author();
        author.setId(1L);
        author.setNickName("GuLangJie");
        author.setRealName("CaiLeiJie007");

        authorDao.update(author);

        System.out.println("更新成功");
    }

    @Test
    public void delete() {
    }

    @Test
    public void findAuthor() {
    }

    @Test
    public void findAuthorList() {
    }
}