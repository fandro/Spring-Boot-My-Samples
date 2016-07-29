package mysample.repository.user;

import mysample.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by fuwb on 16/7/23.
 */

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext(unitName = "primaryPersistenceUnit")
    private EntityManager entityManager;

    @Override
    public List<User> findAll() {
        return this.entityManager.createQuery("select u from User u",User.class)
                .getResultList();
    }
}
