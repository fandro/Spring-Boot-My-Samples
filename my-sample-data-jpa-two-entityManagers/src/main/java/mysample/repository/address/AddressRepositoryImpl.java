package mysample.repository.address;

import mysample.domain.Address;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by fuwb on 16/7/23.
 */

@Repository
public class AddressRepositoryImpl implements AddressRepository {

    @PersistenceContext(unitName = "secondaryPersistenceUnit")
    private EntityManager entityManager;

    @Override
    public List<Address> findAll() {
        return this.entityManager.createQuery("select u from Address u",Address.class)
                .getResultList();
    }
}
