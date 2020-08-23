package com.parameterized;

public class PrimeNumberPrint {
public Boolean validate(final Integer parameter) {
	for(int i=2; i<(parameter/2);i++) {
		if(parameter % i==0) {
			return false;
		}
	}
	return true;
}
	

}
