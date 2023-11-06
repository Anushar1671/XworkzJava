package com.xworkz.app.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.app.dto.HotelDTO;

public class HotelRunner {

	public static void main(String[] args) {

		HotelDTO hotelDTO1 = new HotelDTO(1, "Palm Meadows", "Sanjay Khan", "29AAFCG5311C2ZY", "India");
		HotelDTO hotelDTO2 = new HotelDTO(2, "Taj Falaknuma Palace", "Jamsetji Tata", "29AABCL2550N1Z8", "India");
		HotelDTO hotelDTO3 = new HotelDTO(3, "Oberoi Udaivilas", "Rai Bahaddur", "08AAACE6898B1ZI", "India");
		HotelDTO hotelDTO4 = new HotelDTO(4, "Lazy Bay", "Fairoos M", "27AAKCP2165Q1ZQ", "Srilanka");
		HotelDTO hotelDTO5 = new HotelDTO(5, "Villa Hillcrest", "Debasish chakraborty", "29AAAAH6887M1ZZ", "Srilanka");
		HotelDTO hotelDTO6 = new HotelDTO(6, "Kalu Mirissa", "Smita khorana", "23CSLPK8203Q2Z8", "Srilanka");
		HotelDTO hotelDTO7 = new HotelDTO(7, "Claremont", "Richard blum", "24AAICC5793R1ZT", "USA");
		HotelDTO hotelDTO8 = new HotelDTO(8, "Hilton Garden", "Hilton", "06AAECH6769G1ZB", "USA");
		HotelDTO hotelDTO9 = new HotelDTO(9, "Gilpin Hotel", "Cunliffe", "29ACVRG1245E1FG", "UK");
		HotelDTO hotelDTO10 = new HotelDTO(10, "Cliveden House", "lan livingstone", "26AMFLO8742J5PL", "UK");

		Collection<HotelDTO> hotel = new ArrayList<HotelDTO>();
		hotel.add(hotelDTO1);
		hotel.add(hotelDTO2);
		hotel.add(hotelDTO3);
		hotel.add(hotelDTO4);
		hotel.add(hotelDTO5);
		hotel.add(hotelDTO6);
		hotel.add(hotelDTO7);
		hotel.add(hotelDTO8);
		hotel.add(hotelDTO9);
		hotel.add(hotelDTO10);

		hotel.stream().filter(hotels -> hotels.getLocation().equals("India")).map(h -> h.getName())
				.forEach(h -> System.out.println(h));
		System.out.println("---------------------------------");
		hotel.stream().filter(hotels -> hotels.getLocation().equals("Srilanka")).map(h -> h.getName())
				.forEach(h -> System.out.println(h));
		System.out.println("---------------------------------");
		hotel.stream().map(h -> h.getOwnerName()).forEach(h -> System.out.println(h));
		System.out.println("---------------------------------");
		hotel.stream().map(h -> h.getGst()).forEach(h -> System.out.println(h));
		System.out.println("---------------------------------");
		hotel.stream().filter(hotels -> hotels.getLocation().equals("UK")).map(h -> h.getId())
				.forEach(h -> System.out.println(h));
		System.out.println("---------------------------------");
		hotel.stream().filter(hotels -> hotels.getLocation().equals("USA")).map(h -> h.getOwnerName())
				.forEach(h -> System.out.println(h));

	}

}
