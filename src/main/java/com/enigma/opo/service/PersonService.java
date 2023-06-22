package com.enigma.opo.service;

import com.enigma.opo.entity.Wallet;

import java.math.BigDecimal;
import java.util.List;

public interface PersonService {
    public Wallet createPerson(Wallet wallet);
    public List<Wallet> findAllWallet();
}
