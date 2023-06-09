package com.example.Wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class WalletIntegrationTest {

    @Autowired
    private WalletService walletService;

    @Test
    void createWalletTest(){
        WalletDto newWallet = new WalletDto(1,"arjun",1500.0);
        assertEquals("arjun",this.walletService.createWallet(newWallet).getName());
    }

    @Test
    void getWalletByIdThrowsExceptionTest(){
        assertThrows(WalletException.class, ()->this.walletService.getWalletByID(1000));
    }



}
