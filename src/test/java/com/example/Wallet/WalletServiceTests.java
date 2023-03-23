package com.example.Wallet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class WalletServiceTests {

    @Autowired
    private WalletService walletService;

    @Test
    void createWalletTest(){
        WalletDto newWallet = new WalletDto(1,"Arjun",6700.0);
        assertEquals("Arjun", this.walletService.createWallet(newWallet).getName());
    }
}
