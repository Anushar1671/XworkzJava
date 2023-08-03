package com.xworkz.InheritancePrograms;

public class BrandRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in BrandRunner");
		System.out.println("----------------------");
		Brand brand=new Brand();
		LocalBrand localBrand=new LocalBrand();
		NationalBrand nationalBrand=new NationalBrand();
		DuplicateBrand duplicateBrand=new DuplicateBrand();
		InternationalBrand internationalBrand=new InternationalBrand();
		BrandUtil.brandName(brand);
		System.out.println("----------------------");
		BrandUtil.brandName(localBrand);
		System.out.println("----------------------");
		BrandUtil.brandName(nationalBrand);
		System.out.println("----------------------");
		BrandUtil.brandName(duplicateBrand);
		System.out.println("----------------------");
		BrandUtil.brandName(internationalBrand);
		
		
		
	}

}
