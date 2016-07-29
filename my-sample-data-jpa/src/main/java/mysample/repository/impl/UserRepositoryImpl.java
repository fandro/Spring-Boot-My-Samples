package mysample.repository.impl;

import mysample.domain.User;
import mysample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/*
*
 * Created by fuwb on 16/7/23.

*/

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> findAll() {
        return this.entityManager.createQuery("select u from User u",User.class)
                .getResultList();
    }
}
