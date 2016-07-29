package mysample.repository.user;

import mysample.domain.User;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by fuwb on 16/7/23.
 */
public interface UserRepository extends Repository<User,Integer> {

    List<User> findAll();
}
