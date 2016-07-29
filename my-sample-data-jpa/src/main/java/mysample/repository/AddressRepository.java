package mysample.repository;

import mysample.domain.Address;
import mysample.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by fuwb on 16/7/23.
 */
public interface AddressRepository extends JpaRepository<Address,Integer> {

}
