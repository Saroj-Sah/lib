package com.example.library.util;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

@Component
public class Util {
	
	public LocalDate expectedReturnDate(LocalDate issuedDate) {
		return issuedDate.plus(Period.ofDays(15));
//		return null;
	}

}
