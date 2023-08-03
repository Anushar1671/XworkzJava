package com.xworkz.InheritancePrograms;

public class BrandUtil {
	public static void brandName(Brand brand) {
		brand.brandInfo();
		System.out.println(brand.name);
		if(brand instanceof LocalBrand) {
			System.out.println("Brand is LocalBrand");
			LocalBrand localBrand=new LocalBrand();
			localBrand.localInfo();
			System.out.println(localBrand.cost);
		}
		if(brand instanceof NationalBrand) {
			System.out.println("Brand is NationalBrand");
			NationalBrand nationalBrand=new NationalBrand();
			nationalBrand.nationalBrandInfo();
			System.out.println(nationalBrand.since);
		}
		if(brand instanceof DuplicateBrand) {
			System.out.println("Brand is DuplicateBrand");
			DuplicateBrand duplicateBrand=new DuplicateBrand();
			duplicateBrand.duplicateInfo();
			System.out.println(duplicateBrand.original);
		}
		if(brand instanceof InternationalBrand) {
			System.out.println("Brand is InterNationalBrand");
			InternationalBrand internationalBrand=new InternationalBrand();
			internationalBrand.internationalInfo();
			System.out.println(internationalBrand.price);
		}
	}

}
