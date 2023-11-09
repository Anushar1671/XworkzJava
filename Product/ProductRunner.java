package com.xworkz.app.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.app.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		
		ProductDTO product1 = new ProductDTO(1, 1, 12345, 98765, "Smartphone", "TechCo",
				"High-performance smartphone", "TechCo Packaging", "Charger Earphones", "Electronics", "B01ABCDEF",
				"USA", "Yes", 4.5f, 80, 40, 20, 10, 5, 5, 599.99d, 10d, 0.5d, 1.5d, false, true,
				LocalDate.of(2022, 10, 15), LocalDate.of(2024, 10, 15), LocalDate.of(2022, 10, 1),
				LocalDate.of(2022, 10, 5), LocalDate.of(2022, 11, 1));

		ProductDTO product2 = new ProductDTO(2, 5, 56789, 87654, "Laptop", "TechGadgets",
				"Powerful laptop for work and gaming", "TechGadgets Packaging", "Laptop, Charger", "Electronics",
				"B02ABCDEF", "China", "Yes", 4.8f, 25, 120, 20, 5, 10, 1299.99f, 15, 1.5d, 1.8d, 2.0d, false, true,
				LocalDate.of(2022, 8, 20), LocalDate.of(2024, 8, 20), LocalDate.of(2022, 8, 1),
				LocalDate.of(2022, 8, 5), LocalDate.of(2022, 9, 1));

		ProductDTO product3 = new ProductDTO(3, 7, 98765, 54321, "Tablet", "TechTabs", "Compact tablet for on-the-go",
				"TechTabs Packaging", "Tablet, Charger", "Electronics", "B03ABCDEF", "Japan", "No", 4.2f, 100, 40, 30,
				20, 10, 5, 299.99f, 5, 0.8d, 1.0d, false, true, LocalDate.of(2022, 12, 10), LocalDate.of(2024, 12, 10),
				LocalDate.of(2022, 12, 1), LocalDate.of(2022, 12, 5), LocalDate.of(2023, 1, 1));

		ProductDTO product4 = new ProductDTO(4, 3, 98765, 12345, "Smartwatch", "TechWear",
				"Fitness and health tracking smartwatch", "TechWear Packaging", "Smartwatch, Charging Cable",
				"Wearables", "B04ABCDEF", "Germany", "Yes", 4.0f, 80, 30, 20, 10, 10, 10, 149.99, 5, 0.2, 0.8, false,
				true, LocalDate.of(2022, 5, 25), LocalDate.of(2024, 5, 25), LocalDate.of(2022, 5, 1),
				LocalDate.of(2022, 5, 5), LocalDate.of(2022, 6, 1));

		ProductDTO product5 = new ProductDTO(5, 2, 76543, 23456, "Bluetooth Speaker", "TechAudio",
				"Portable wireless speaker with rich sound", "TechAudio Packaging", "Speaker, USB Cable", "Audio",
				"B05ABCDEF", "South Korea", "No", 4.5f, 50, 20, 10, 10, 10, 10, 79.99, 10, 0.5, 1.0, false, true,
				LocalDate.of(2022, 9, 18), LocalDate.of(2024, 9, 18), LocalDate.of(2022, 9, 1),
				LocalDate.of(2022, 9, 5), LocalDate.of(2022, 10, 1));

		ProductDTO product6 = new ProductDTO(6, 4, 54321, 34567, "Coffee Maker", "TechBrew",
				"Automatic drip coffee maker for home use", "TechBrew Packaging", "Coffee Maker, Carafe", "Appliances",
				"B06ABCDEF", "Italy", "Yes", 4.6f, 60, 30, 20, 10, 5, 2, 129.99, 10, 2.0, 1.5, false, true,
				LocalDate.of(2023, 3, 5), LocalDate.of(2025, 3, 5), LocalDate.of(2023, 3, 1), LocalDate.of(2023, 3, 5),
				LocalDate.of(2023, 4, 1));

		ProductDTO product7 = new ProductDTO(7, 2, 87654, 65432, "Wireless Headphones", "TechAudio",
				"Over-ear wireless headphones for immersive sound", "TechAudio Packaging", "Headphones, Charging Cable",
				"Audio", "B07ABCDEF", "USA", "No", 4.6f, 30, 10, 10, 5, 5, 10, 129.99, 5, 0.3, 1.0, false, true,
				LocalDate.of(2023, 2, 5), LocalDate.of(2025, 2, 5), LocalDate.of(2023, 2, 1), LocalDate.of(2023, 2, 5),
				LocalDate.of(2023, 3, 1));

		ProductDTO product8 = new ProductDTO(8, 6, 23456, 45678, "Digital Camera", "TechCapture",
				"High-resolution digital camera for photography enthusiasts", "TechCapture Packaging",
				"Camera, Lens, Memory Card", "Electronics", "B08ABCDEF", "Japan", "Yes", 4.8f, 80, 50, 20, 5, 5, 10,
				599.99, 15, 0.7, 2.0, false, true, LocalDate.of(2022, 7, 15), LocalDate.of(2024, 7, 15),
				LocalDate.of(2022, 7, 1), LocalDate.of(2022, 7, 5), LocalDate.of(2022, 8, 1));

		ProductDTO product9 = new ProductDTO(9, 150, 34567, 56789, "Smart LED TV", "TechVision",
				"Ultra HD smart LED TV for cinematic experience", "TechVision Packaging", "TV, Remote, Stand",
				"Electronics", "B09ABCDEF", "South Korea", "Yes", 4.7f, 120, 80, 30, 10, 8, 9, 899.99, 20, 15.0, 2.0,
				false, true, LocalDate.of(2022, 3, 28), LocalDate.of(2024, 3, 28), LocalDate.of(2022, 3, 1),
				LocalDate.of(2022, 3, 5), LocalDate.of(2022, 4, 1));

		ProductDTO product10 = new ProductDTO(10, 200, 45678, 78901, "Smart Refrigerator", "TechCool",
				"Smart refrigerator with advanced cooling technology", "TechCool Packaging",
				"Refrigerator, User Manual", "Appliances", "B10ABCDEF", "Germany", "Yes", 4.5f, 180, 100, 50, 20, 10, 10,
				1499.99, 25, 100.0, 3.0, false, true, LocalDate.of(2022, 1, 10), LocalDate.of(2024, 1, 10),
				LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 5), LocalDate.of(2022, 2, 1));

		Collection<ProductDTO> collection = new LinkedList<ProductDTO>();
		collection.add(product1);
		collection.add(product2);
		collection.add(product3);
		collection.add(product4);
		collection.add(product5);
		collection.add(product6);
		collection.add(product7);
		collection.add(product8);
		collection.add(product9);
		collection.add(product10);

		System.out.println("*************id-asc*****************");
		Comparator<ProductDTO> id=(t1,t2)->Integer.compare(t1.getId(), t2.getId());
		collection.stream().sorted(id).forEach(n->System.out.println(n));
		System.out.println("-----------id-desc-----------");
		Comparator<ProductDTO> id1=(t1,t2)->Integer.compare(t2.getId(), t1.getId());
		collection.stream().sorted(id1).forEach(n->System.out.println(n));
		System.out.println("**************quantity-asc****************");
		Comparator<ProductDTO> quant=(t1,t2)->Integer.compare(t1.getQuantity(), t2.getQuantity());
		collection.stream().sorted(quant).forEach(n->System.out.println(n));
		System.out.println("---------quantity-desc-------------");
		Comparator<ProductDTO> quant1=(t1,t2)->Integer.compare(t2.getQuantity(), t1.getQuantity());
		collection.stream().sorted(quant1).forEach(n->System.out.println(n));
		System.out.println("*************model-asc*****************");
		Comparator<ProductDTO> model=(t1,t2)->Integer.compare(t1.getModelNo(), t2.getModelNo());
		collection.stream().sorted(model).forEach(n->System.out.println(n));
		System.out.println("----------model-desc------------");
		Comparator<ProductDTO> model1=(t1,t2)->Integer.compare(t2.getModelNo(), t1.getModelNo());
		collection.stream().sorted(model1).forEach(n->System.out.println(n));
		System.out.println("**************SerialNo-asc****************");
		Comparator<ProductDTO> serialNo=(t1,t2)->Integer.compare(t1.getSerialNo(), t2.getSerialNo());
		collection.stream().sorted(serialNo).forEach(n->System.out.println(n));
		System.out.println("----------SerialNo-desc------------");
		Comparator<ProductDTO> serialNo1=(t1,t2)->Integer.compare(t2.getSerialNo(), t1.getSerialNo());
		collection.stream().sorted(serialNo1).forEach(n->System.out.println(n));
		System.out.println("**************ProductName-asc****************");
		Comparator<ProductDTO> pName=(t1,t2)->t1.getName().compareTo(t2.getName());
		collection.stream().sorted(pName).forEach(n->System.out.println(n));
		System.out.println("----------ProductName-desc------------");
		Comparator<ProductDTO> pName1=(t1,t2)->t2.getName().compareTo(t1.getName());
		collection.stream().sorted(pName1).forEach(n->System.out.println(n));
		System.out.println("*************Company-asc*****************");
		Comparator<ProductDTO> company=(t1,t2)->t1.getCompany().compareTo(t2.getCompany());
		collection.stream().sorted(company).forEach(n->System.out.println(n));
		System.out.println("----------Company-desc------------");
		Comparator<ProductDTO> company1=(t1,t2)->t2.getCompany().compareTo(t1.getCompany());
		collection.stream().sorted(company1).forEach(n->System.out.println(n));
		System.out.println("**************Description-asc****************");
		Comparator<ProductDTO> disc=(t1,t2)->t1.getDiscription().compareTo(t2.getDiscription());
		collection.stream().sorted(disc).forEach(n->System.out.println(n));
		System.out.println("----------Description-desc------------");
		Comparator<ProductDTO> disc1=(t1,t2)->t2.getDiscription().compareTo(t1.getDiscription());
		collection.stream().sorted(disc1).forEach(n->System.out.println(n));
		System.out.println("****************Packer-asc**************");
		Comparator<ProductDTO> packer=(t1,t2)->t1.getPacker().compareTo(t2.getPacker());
		collection.stream().sorted(packer).forEach(n->System.out.println(n));
		System.out.println("----------Packer-desc------------");
		Comparator<ProductDTO> packer1=(t1,t2)->t2.getPacker().compareTo(t1.getPacker());
		collection.stream().sorted(packer1).forEach(n->System.out.println(n));
		System.out.println("**************Include-asc****************");
		Comparator<ProductDTO> include=(t1,t2)->t1.getIncluded().compareTo(t2.getIncluded());
		collection.stream().sorted(include).forEach(n->System.out.println(n));
		System.out.println("----------Include-desc------------");
		Comparator<ProductDTO> include1=(t1,t2)->t2.getIncluded().compareTo(t1.getIncluded());
		collection.stream().sorted(include1).forEach(n->System.out.println(n));
		System.out.println("*************Generic-asc*****************");
		Comparator<ProductDTO> generic=(t1,t2)->t1.getGenericName().compareTo(t2.getGenericName());
		collection.stream().sorted(generic).forEach(n->System.out.println(n));
		System.out.println("---------Generic-desc-------------");
		Comparator<ProductDTO> generic1=(t1,t2)->t2.getGenericName().compareTo(t1.getGenericName());
		collection.stream().sorted(generic1).forEach(n->System.out.println(n));
		System.out.println("****************asin-asc**************");
		Comparator<ProductDTO> asin=(t1,t2)->t1.getAsin().compareTo(t2.getAsin());
		collection.stream().sorted(asin).forEach(n->System.out.println(n));
		System.out.println("----------asin-desc------------");
		Comparator<ProductDTO> asin1=(t1,t2)->t2.getAsin().compareTo(t1.getAsin());
		collection.stream().sorted(asin1).forEach(n->System.out.println(n));
		System.out.println("*************Country-asc*****************");
		Comparator<ProductDTO> country=(t1,t2)->t1.getCountryOfOrigin().compareTo(t2.getCountryOfOrigin());
		collection.stream().sorted(country).forEach(n->System.out.println(n));
		System.out.println("----------Country-desc------------");
		Comparator<ProductDTO> country1=(t1,t2)->t2.getCountryOfOrigin().compareTo(t1.getCountryOfOrigin());
		collection.stream().sorted(country1).forEach(n->System.out.println(n));
		System.out.println("***************Prime-asc***************");
		Comparator<ProductDTO> prime=(t1,t2)->t1.getPrimeDelivery().compareTo(t2.getPrimeDelivery());
		collection.stream().sorted(prime).forEach(n->System.out.println(n));
		System.out.println("----------Prime-desc------------");
		Comparator<ProductDTO> prime1=(t1,t2)->t2.getPrimeDelivery().compareTo(t1.getPrimeDelivery());
		collection.stream().sorted(prime1).forEach(n->System.out.println(n));
		System.out.println("*************Rating-asc*****************");
		Comparator<ProductDTO> rating=(t1,t2)->Float.compare(t1.getRating(), t2.getRating());
		collection.stream().sorted(rating).forEach(n->System.out.println(n));
		System.out.println("----------Rating-desc------------");
		Comparator<ProductDTO> rating1=(t1,t2)->Float.compare(t2.getRating(), t1.getRating());
		collection.stream().sorted(rating1).forEach(n->System.out.println(n));
		System.out.println("*************RatingPeople-asc*****************");
		Comparator<ProductDTO> pRated=(t1,t2)->Float.compare(t1.getPeopleRated(), t2.getPeopleRated());
		collection.stream().sorted(pRated).forEach(n->System.out.println(n));
		System.out.println("-----------RatingPeople-desc-----------");
		Comparator<ProductDTO> pRated1=(t1,t2)->Float.compare(t2.getPeopleRated(), t1.getPeopleRated());
		collection.stream().sorted(pRated1).forEach(n->System.out.println(n));
		System.out.println("***************RatingFive-asc***************");
		Comparator<ProductDTO> fiveRating=(t1,t2)->Float.compare(t1.getPeopleRatedFive(), t2.getPeopleRatedFive());
		collection.stream().sorted(fiveRating).forEach(n->System.out.println(n));
		System.out.println("----------RatingFive-desc------------");
		Comparator<ProductDTO> fiveRating1=(t1,t2)->Float.compare(t2.getPeopleRatedFive(), t1.getPeopleRatedFive());
		collection.stream().sorted(fiveRating1).forEach(n->System.out.println(n));
		System.out.println("**************RatingFour-asc****************");
		Comparator<ProductDTO> fourRating=(t1,t2)->Float.compare(t1.getPeopleRatedFour(), t2.getPeopleRatedFour());
		collection.stream().sorted(fourRating).forEach(n->System.out.println(n));
		System.out.println("----------RatingFour-desc------------");
		Comparator<ProductDTO> fourRating1=(t1,t2)->Float.compare(t2.getPeopleRatedFour(), t1.getPeopleRatedFour());
		collection.stream().sorted(fourRating1).forEach(n->System.out.println(n));
		System.out.println("*************RatingThree-asc*****************");
		Comparator<ProductDTO> threeRating=(t1,t2)->Float.compare(t1.getPeopleRatedThree(), t2.getPeopleRatedThree());
		collection.stream().sorted(threeRating).forEach(n->System.out.println(n));
		System.out.println("-----------RatingThree-desc-----------");
		Comparator<ProductDTO> threeRating1=(t1,t2)->Float.compare(t2.getPeopleRatedThree(), t1.getPeopleRatedThree());
		collection.stream().sorted(threeRating1).forEach(n->System.out.println(n));
		System.out.println("**************RatingTwo-asc****************");
		Comparator<ProductDTO> twoRating=(t1,t2)->Float.compare(t1.getPeopleRatedTwo(), t2.getPeopleRatedTwo());
		collection.stream().sorted(twoRating).forEach(n->System.out.println(n));
		System.out.println("-----------RatingTwo-desc-----------");
		Comparator<ProductDTO> twoRating1=(t1,t2)->Float.compare(t2.getPeopleRatedTwo(), t1.getPeopleRatedTwo());
		collection.stream().sorted(twoRating1).forEach(n->System.out.println(n));
		System.out.println("***************RatingOne-asc***************");
		Comparator<ProductDTO> oneRating=(t1,t2)->Float.compare(t1.getPeopleRatedOne(), t2.getPeopleRatedOne());
		collection.stream().sorted(oneRating).forEach(n->System.out.println(n));
		System.out.println("-----------RatingOne-desc-----------");
		Comparator<ProductDTO> oneRating1=(t1,t2)->Float.compare(t2.getPeopleRatedOne(), t1.getPeopleRatedOne());
		collection.stream().sorted(oneRating1).forEach(n->System.out.println(n));
		System.out.println("**************Price-asc****************");
		Comparator<ProductDTO> price=(t1,t2)->Double.compare(t1.getPrice(), t2.getPrice());
		collection.stream().sorted(price).forEach(n->System.out.println(n));
		System.out.println("-----------Price-desc-----------");
		Comparator<ProductDTO> price1=(t1,t2)->Double.compare(t2.getPrice(), t1.getPrice());
		collection.stream().sorted(price1).forEach(n->System.out.println(n));
		System.out.println("*************Discount-asc*****************");
		Comparator<ProductDTO> discount=(t1,t2)->Double.compare(t1.getDiscount(), t2.getDiscount());
		collection.stream().sorted(discount).forEach(n->System.out.println(n));
		System.out.println("-----------Discount-desc-----------");
		Comparator<ProductDTO> discount1=(t1,t2)->Double.compare(t2.getDiscount(), t1.getDiscount());
		collection.stream().sorted(discount1).forEach(n->System.out.println(n));
		System.out.println("*************Weight-asc*****************");
		Comparator<ProductDTO> weight=(t1,t2)->Double.compare(t1.getItemWeight(), t2.getItemWeight());
		collection.stream().sorted(weight).forEach(n->System.out.println(n));
		System.out.println("-----------Weight-desc-----------");
		Comparator<ProductDTO> weight1=(t1,t2)->Double.compare(t2.getItemWeight(), t1.getItemWeight());
		collection.stream().sorted(weight1).forEach(n->System.out.println(n));
		System.out.println("*************Warranty-asc*****************");
		Comparator<ProductDTO> warranty=(t1,t2)->Double.compare(t1.getWarranty(), t2.getWarranty());
		collection.stream().sorted(warranty).forEach(n->System.out.println(n));
		System.out.println("---------Warranty-desc-------------");
		Comparator<ProductDTO> warranty1=(t1,t2)->Double.compare(t2.getWarranty(), t1.getWarranty());
		collection.stream().sorted(warranty1).forEach(n->System.out.println(n));
		System.out.println("*************Damage-asc*****************");
		Comparator<ProductDTO> damage=(t1,t2)->Boolean.compare(t1.isDamaged(), t2.isDamaged());
		collection.stream().sorted(damage).forEach(n->System.out.println(n));
		System.out.println("---------Damage-desc-------------");
		Comparator<ProductDTO> damage1=(t1,t2)->Boolean.compare(t2.isDamaged(), t1.isDamaged());
		collection.stream().sorted(damage1).forEach(n->System.out.println(n));
		System.out.println("*************Returnable-asc*****************");
		Comparator<ProductDTO> returnable=(t1,t2)->Boolean.compare(t1.isReturnable(), t2.isReturnable());
		collection.stream().sorted(returnable).forEach(n->System.out.println(n));
		System.out.println("-----------Returnable-desc-----------");
		Comparator<ProductDTO> returnable1=(t1,t2)->Boolean.compare(t2.isReturnable(), t1.isReturnable());
		collection.stream().sorted(returnable1).forEach(n->System.out.println(n));
		System.out.println("*************ManufactureDate-asc*****************");
		Comparator<ProductDTO> manf=(t1,t2)->t1.getManfDate().compareTo(t2.getManfDate());
		collection.stream().sorted(manf).forEach(n->System.out.println(n));
		System.out.println("----------ManufactureDate-desc------------");
		Comparator<ProductDTO> manf1=(t1,t2)->t2.getManfDate().compareTo(t1.getManfDate());
		collection.stream().sorted(manf1).forEach(n->System.out.println(n));
		System.out.println("*************ExpiryDate-asc*****************");
		Comparator<ProductDTO> expiry=(t1,t2)->t1.getExpiryDate().compareTo(t2.getExpiryDate());
		collection.stream().sorted(expiry).forEach(n->System.out.println(n));
		System.out.println("----------ExpiryDate-desc------------");
		Comparator<ProductDTO> expiry1=(t1,t2)->t2.getExpiryDate().compareTo(t1.getExpiryDate());
		collection.stream().sorted(expiry1).forEach(n->System.out.println(n));
		System.out.println("************Available-asc******************");
		Comparator<ProductDTO> avail=(t1,t2)->t1.getDateFirstAvailable().compareTo(t2.getDateFirstAvailable());
		collection.stream().sorted(avail).forEach(n->System.out.println(n));
		System.out.println("-----------Available-desc-----------");
		Comparator<ProductDTO> avail1=(t1,t2)->t2.getDateFirstAvailable().compareTo(t1.getDateFirstAvailable());
		collection.stream().sorted(avail1).forEach(n->System.out.println(n));
		System.out.println("*************DeliveryExpected-asc*****************");
		Comparator<ProductDTO> expect=(t1,t2)->t1.getDeliveryExpectedDate().compareTo(t2.getDeliveryExpectedDate());
		collection.stream().sorted(expect).forEach(n->System.out.println(n));
		System.out.println("----------DeliveryExpected-desc------------");
		Comparator<ProductDTO> expect1=(t1,t2)->t2.getDeliveryExpectedDate().compareTo(t1.getDeliveryExpectedDate());
		collection.stream().sorted(expect1).forEach(n->System.out.println(n));
		System.out.println("*************ReturnBy-asc*****************");
		Comparator<ProductDTO> returnBy=(t1,t2)->t1.getReturnBy().compareTo(t2.getReturnBy());
		collection.stream().sorted(returnBy).forEach(n->System.out.println(n));
		System.out.println("----------ReturnBy-desc------------");
		Comparator<ProductDTO> returnBy1=(t1,t2)->t2.getReturnBy().compareTo(t1.getReturnBy());
		collection.stream().sorted(returnBy1).forEach(n->System.out.println(n));
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		collection.stream().sorted(price.thenComparing(quant).thenComparing(model)).forEach(p->System.out.println(p));
		System.out.println("################################");
		collection.stream().sorted(warranty.thenComparing(damage).thenComparing(returnable)).forEach(p->System.out.println(p));
		System.out.println("################################");
		collection.stream().sorted(model.thenComparing(company).thenComparing(packer)).forEach(p->System.out.println(p));
		System.out.println("################################");
		collection.stream().sorted(disc.thenComparing(weight).thenComparing(rating)).forEach(p->System.out.println(p));
		System.out.println("################################");
		collection.stream().sorted(warranty.thenComparing(avail).thenComparing(returnBy)).forEach(p->System.out.println(p));
		System.out.println("################################");
		collection.stream().sorted(rating.thenComparing(pRated).thenComparing(fiveRating)).forEach(p->System.out.println(p));
		System.out.println("################################");
		collection.stream().sorted(packer.thenComparing(generic).thenComparing(include)).forEach(p->System.out.println(p));
		System.out.println("################################");
		collection.stream().sorted(company.thenComparing(asin).thenComparing(country)).forEach(p->System.out.println(p));
		System.out.println("################################");
		collection.stream().sorted(quant.thenComparing(price).thenComparing(rating)).forEach(p->System.out.println(p));
		System.out.println("################################");
		collection.stream().sorted(weight.thenComparing(discount).thenComparing(warranty)).forEach(p->System.out.println(p));
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		collection.stream().sorted(quant1.thenComparing(price1)).forEach(i->System.out.println(i));
		System.out.println("***********************************");
		collection.stream().sorted(model1.thenComparing(asin1)).forEach(i->System.out.println(i));
		System.out.println("***********************************");
		collection.stream().sorted(rating1.thenComparing(fourRating1)).forEach(i->System.out.println(i));
		System.out.println("***********************************");
		collection.stream().sorted(price1.thenComparing(discount1)).forEach(i->System.out.println(i));
		System.out.println("***********************************");
		collection.stream().sorted(company1.thenComparing(country1)).forEach(i->System.out.println(i));
		System.out.println("***********************************");
		collection.stream().sorted(include1.thenComparing(generic1)).forEach(i->System.out.println(i));
		System.out.println("***********************************");
		collection.stream().sorted(damage1.thenComparing(returnable1)).forEach(i->System.out.println(i));
		System.out.println("***********************************");
		collection.stream().sorted(avail1.thenComparing(expect1)).forEach(i->System.out.println(i));
		System.out.println("***********************************");
		collection.stream().sorted(returnable1.thenComparing(returnBy1)).forEach(i->System.out.println(i));
		System.out.println("***********************************");
		collection.stream().sorted(prime1.thenComparing(manf1)).forEach(i->System.out.println(i));
		
		System.out.println("~~~~~~~~~id~~~~~~~~~~");
		collection.stream().map(m->m.getId()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~quantity~~~~~~~~~~~");
		collection.stream().map(m->m.getQuantity()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~modelno~~~~~~~~~~");
		collection.stream().map(m->m.getModelNo()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~serialno~~~~~~~~~~");
		collection.stream().map(m->m.getSerialNo()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~name~~~~~~~~~~~");
		collection.stream().map(m->m.getName()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~company~~~~~~~~~~~");
		collection.stream().map(m->m.getCompany()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~Description~~~~~~~~~~");
		collection.stream().map(m->m.getDiscription()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~~packer~~~~~~~~~");
		collection.stream().map(m->m.getPacker()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~include~~~~~~~~~~");
		collection.stream().map(m->m.getIncluded()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~generic~~~~~~~~~~");
		collection.stream().map(m->m.getGenericName()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~asin~~~~~~~~~~~");
		collection.stream().map(m->m.getAsin()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~country~~~~~~~~~~");
		collection.stream().map(m->m.getCountryOfOrigin()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~prime~~~~~~~~~~");
		collection.stream().map(m->m.getPrimeDelivery()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~rating~~~~~~~~~~~");
		collection.stream().map(m->m.getRating()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~peoplerated~~~~~~~~~~");
		collection.stream().map(m->m.getPeopleRated()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~ratedfive~~~~~~~~~~~");
		collection.stream().map(m->m.getPeopleRatedFive()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~ratedfour~~~~~~~~~~~");
		collection.stream().map(m->m.getPeopleRatedFour()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~ratedthree~~~~~~~~~~");
		collection.stream().map(m->m.getPeopleRatedThree()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~ratedtwo~~~~~~~~~~");
		collection.stream().map(m->m.getPeopleRatedTwo()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~ratedone~~~~~~~~~~");
		collection.stream().map(m->m.getPeopleRatedOne()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~price~~~~~~~~~~");
		collection.stream().map(m->m.getPrice()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~discount~~~~~~~~~~");
		collection.stream().map(m->m.getDiscount()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~weight~~~~~~~~~~");
		collection.stream().map(m->m.getItemWeight()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~warranty~~~~~~~~~~");
		collection.stream().map(m->m.getWarranty()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~~damaged~~~~~~~~~");
		collection.stream().map(m->m.isDamaged()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~returnable~~~~~~~~~~~");
		collection.stream().map(m->m.isReturnable()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~manufacturedate~~~~~~~~~~");
		collection.stream().map(m->m.getManfDate()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~expirydate~~~~~~~~~~~");
		collection.stream().map(m->m.getExpiryDate()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~firstavailable~~~~~~~~~~~");
		collection.stream().map(m->m.getDateFirstAvailable()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~~expected~~~~~~~~~~");
		collection.stream().map(m->m.getDeliveryExpectedDate()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		System.out.println("~~~~~~~~returnby~~~~~~~~~~~");
		collection.stream().map(m->m.getReturnBy()).collect(Collectors.toList()).forEach(a->System.out.println(a));
		
	}
}
