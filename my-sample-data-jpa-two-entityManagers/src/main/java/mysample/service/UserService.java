package mysample.service;

import mysample.domain.User;

import java.util.List;

/**
 * Created by fuwb on 16/7/23.
 */
public interface UserService {
    List<User> findAll();
}
