package com.intern.crm_system.Controller;

import com.intern.crm_system.Entity.Address;
import com.intern.crm_system.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{addressId}")
    public ResponseEntity<Address> getAddressById(@PathVariable Long addressId) {
        Address address = addressService.getAddressById(addressId);
        return ResponseEntity.ok(address);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Address>> getAllAddresses() {
        List<Address> addresses = addressService.getAllAddresses();
        return ResponseEntity.ok(addresses);
    }

    @PostMapping("/add")
    public ResponseEntity<Address> addAddress(@RequestBody Address address) {
        Address newAddress = addressService.addAddress(address);
        return new ResponseEntity<>(newAddress, HttpStatus.CREATED);
    }

    @PutMapping("/update/{addressId}")
    public ResponseEntity<Address> updateAddressById(@PathVariable Long addressId, @RequestBody Address address) {
        Address updatedAddress = addressService.updateAddressById(addressId, address);
        return ResponseEntity.ok(updatedAddress);
    }

    @DeleteMapping("/delete/{addressId}")
    public ResponseEntity<?> deleteAddressById(@PathVariable Long addressId) {
        addressService.deleteAddressById(addressId);
        return ResponseEntity.ok().build();
    }
}
