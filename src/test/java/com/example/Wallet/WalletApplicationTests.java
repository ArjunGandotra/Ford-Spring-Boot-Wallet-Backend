package com.example.Wallet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@SpringBootTest
class WalletApplicationTests {

	@Autowired
	private WalletService walletService;



	@Test
	void testCreateWallet(){
		WalletDto wallet1 =new WalletDto(1,"Arjun","arjun@email.com",1500.0);
		assertEquals("Arjun", this.walletService.createWallet(wallet1).getName());
	}

	@Test
	void testGetWalletIdThrowsException(){

		assertThrows(WalletException.class, ()->this.walletService.getWalletByID(10));

	}
	@Test
	void testUpdateWallet() throws WalletException {
		WalletDto wallet1 = new WalletDto(1,"Arjun","arjun@email.com",1500.0);
		assertEquals(1500.0,this.walletService.updateWallet(wallet1).getBalance());
	}



}
