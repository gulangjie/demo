package com.example.demo.dao;

import com.example.demo.pojo.Author;

import java.util.List;

public interface AuthorDao {
    int add(Author author);

    int update(Author author);

    int delete(Long id);

    Author findAuthor(Long id);

    List<Author> findAuthorList();
}
