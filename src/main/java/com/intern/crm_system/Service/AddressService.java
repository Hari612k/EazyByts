package com.intern.crm_system.Service;

import com.intern.crm_system.Entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddresses();
    Address getAddressById(Long id);
    Address updateAddressById(Long addressId, Address address);
    void deleteAddressById(Long id);

    Address addAddress(Address address);
}
