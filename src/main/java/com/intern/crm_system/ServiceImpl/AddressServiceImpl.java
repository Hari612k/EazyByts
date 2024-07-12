package com.intern.crm_system.ServiceImpl;

import com.intern.crm_system.Entity.Address;
import com.intern.crm_system.Repository.AddressRepository;
import com.intern.crm_system.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address updateAddressById(Long addressId, Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddressById(Long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }
}
