package com.example.Wallet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface WalletJpaRepository extends JpaRepository<WalletDto,Integer> {
}
