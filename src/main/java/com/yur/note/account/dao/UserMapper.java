package com.yur.note.account.dao;

import com.yur.note.account.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User getUserById(Integer userId);

}
