package com.enigma.opo.Repository;

import com.enigma.opo.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, String> {

    @Query(value = "SELECT * FROM mst_person", nativeQuery = true )
    public Wallet findWalletByPhoneNumber(String phoneNumber);


}
