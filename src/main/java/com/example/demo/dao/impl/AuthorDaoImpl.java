package com.example.demo.dao.impl;

import com.example.demo.dao.AuthorDao;
import com.example.demo.pojo.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AuthorDaoImpl implements AuthorDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public int add(Author author) {
        String sql = "insert into t_author(id,real_name,nick_name) " +
                "values(:id,:realName,:nickName)";
        Map<String, Object> param = new HashMap<>();
        param.put("id",author.getId());
        param.put("realName", author.getRealName());
        param.put("nickName", author.getNickName());

        return (int) jdbcTemplate.update(sql, param);
    }

    @Override
    public int update(Author author) {
        String sql = "UPDATE t_author SET real_name = :realName, nick_name = :nickName where id = :id";
        Map<String, Object> param = new HashMap<>();
        param.put("id",author.getId());
        param.put("realName", author.getRealName());
        param.put("nickName", author.getNickName());

        return (int)jdbcTemplate.update(sql, param);
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public Author findAuthor(Long id) {
        return null;
    }

    @Override
    public List<Author> findAuthorList() {
        return null;
    }
}
