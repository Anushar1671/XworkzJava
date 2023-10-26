package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {

	public static void main(String[] args) {
		Collection<Long> mobile = new ArrayList<Long>();
		mobile.add(8966549873l);
		mobile.add(7412369874l);
		mobile.add(9654785214l);
		mobile.add(8521475632l);
		mobile.add(9632145214l);
		mobile.add(7412365425l);
		mobile.add(6547896321l);
		mobile.add(9514752365l);
		mobile.add(9547523652l);
		mobile.add(7748963212l);
		mobile.add(9651475236l);
		mobile.add(8417426932l);
		mobile.add(8545652365l);
		mobile.add(8478654122l);
		mobile.add(7541236545l);
		mobile.add(9821452365l);
		mobile.add(9988774455l);
		mobile.add(9985478565l);
		mobile.add(9658445868l);
		mobile.add(9875665556l);
		mobile.add(9998887775l);
		mobile.add(8887775544l);
		mobile.add(7788996545l);
		mobile.add(7845874587l);
		mobile.add(9855489899l);
		mobile.add(7887788787l);
		mobile.add(9611965471l);
		mobile.add(9108074144l);
		mobile.add(9972534039l);
		mobile.add(8147083556l);
		Iterator<Long> itr = mobile.iterator();
		while (itr.hasNext()) {
			Long value = itr.next();
			System.out.println("Mobile Number :" + value);

		}

	}

}
