package com.yur.note.account.service;

import com.yur.note.account.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User getUserById(Integer userId) throws Exception;

}
