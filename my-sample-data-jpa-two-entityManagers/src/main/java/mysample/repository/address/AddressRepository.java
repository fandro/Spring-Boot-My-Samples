package mysample.repository.address;

import mysample.domain.Address;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by fuwb on 16/7/23.
 */
public interface AddressRepository extends Repository<Address,Integer> {

    List<Address> findAll();

}
