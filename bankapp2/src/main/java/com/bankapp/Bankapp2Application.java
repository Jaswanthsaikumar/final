package com.bankapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.dto.AddressChangeRequest;
import com.bankapp.entities.Account;
import com.bankapp.entities.AppUser;
import com.bankapp.entities.TransactionLog;
import com.bankapp.repo.TransactionLogRepo;
import com.bankapp.service.AccountService;
import com.bankapp.service.AppUserService;

@SpringBootApplication
public class Bankapp2Application implements CommandLineRunner {
	@Autowired
	private AccountService accountService;

	@Autowired
	private TransactionLogRepo logRepo;

	@Autowired
	private AppUserService appUserService;

	public static void main(String[] args) {
		SpringApplication.run(Bankapp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		/*
		 * Account account = new Account("kumar", 1000, "saving", "AP", "NRI",
		 * "9587432610", "kumar@gmail.com", LocalDate.of(2020, Month.JUNE, 19)); Account
		 * account1 = new Account("jai", 1000, "saving", "AP", "VSP", "94265446135",
		 * "jai.@gmail.com", LocalDate.of(2021, Month.JULY, 20));
		 * accountService.Save(account); accountService.Save(account1);
		 * 
		 * accountService.transfer(1, 2, 250); accountService.deposit(1, 200);
		 * accountService.withdraw(2, 150);
		 * 
		 * AddressChangeRequest addressChangeRequest = new
		 * AddressChangeRequest("AV road", " hyderabad", "8546242560",
		 * "aravind@gmail.com"); accountService.changeAddress(1, addressChangeRequest);
		 * List<TransactionLog> list = logRepo.findByFromAccount(2); for (TransactionLog
		 * log : list) System.out.println(log);
		 * 
		 * AppUser appUser1 = new AppUser("prasanth", "prasanth123", "admin", "AP",
		 * "RJY", "86521675612", "prasanth@gmail.com", LocalDate.of(2015, Month.MARCH,
		 * 15)); AppUser appUser2 = new AppUser("sri", "sri123", "admin", "TN",
		 * "Chennai", "9876531093", "ram@gmail.com", LocalDate.of(2016, Month.MARCH,
		 * 19));
		 * 
		 * appUserService.addAppUser(appUser1); appUserService.addAppUser(appUser2);
		 */
		 }

}
