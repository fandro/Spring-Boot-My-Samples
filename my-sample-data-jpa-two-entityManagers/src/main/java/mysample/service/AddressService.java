package mysample.service;

import mysample.domain.Address;

import java.util.List;

/**
 * Created by fuwb on 16/7/24.
 */
public interface AddressService {
    List<Address> findAll();
}
