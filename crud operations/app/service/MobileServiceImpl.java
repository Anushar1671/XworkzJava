package com.xworkz.crud.app.service;

import com.xworkz.crud.app.dto.MobileDTO;
import com.xworkz.crud.app.repository.MobileRepository;

public class MobileServiceImpl implements MobileService {
	private MobileRepository mobileRepository;

	public MobileServiceImpl(MobileRepository mobileRepository) {
		this.mobileRepository = mobileRepository;
	}

	@Override
	public boolean validateAndSave(MobileDTO dto) {
		if (dto != null) {
			String brand = dto.getBrand();
			String color = dto.getColor();
			double price = dto.getPrice();
			String shopName = dto.getShopName();
			int storage = dto.getStorage();
			boolean goodCamera = dto.isGoodCamera();
			String userName = dto.getUserName();
			boolean fingerLock = dto.isFingerLock();
			int noOfApps = dto.getNoOfApps();
			String location = dto.getLocation();

			if (brand != null && !brand.isEmpty() && brand.length() > 3 && brand.length() <= 20) {
				System.out.println("brand is valid");
			} else {
				System.err.println("brand is invalid");
				return false;
			}

			if (color != null && !color.isEmpty() && color.length() > 3 && color.length() <= 20) {
				System.out.println("color is valid");
			} else {
				System.err.println("color is invalid");
				return false;
			}

			if (shopName != null && !shopName.isEmpty() && shopName.length() > 3 && shopName.length() <= 20) {
				System.out.println("shopName is valid");
			} else {
				System.err.println("shopName is invalid");
				return false;
			}

			if (userName != null && !userName.isEmpty() && userName.length() > 3 && userName.length() <= 20) {
				System.out.println("userName is valid");
			} else {
				System.err.println("userName is invalid");
				return false;
			}

			if (location != null && !location.isEmpty() && location.length() > 3 && location.length() <= 20) {
				System.out.println("location is valid");
			} else {
				System.err.println("location is invalid");
				return false;
			}

			if (storage > 0) {
				System.out.println("storage is valid");
			} else {
				System.err.println("storage is invalid");
				return false;
			}

			if (price > 5000) {
				System.out.println("price is valid");
			} else {
				System.err.println("price is invalid");
				return false;
			}

			if (noOfApps > 0) {
				System.out.println("noOfApps is valid");
			} else {
				System.err.println("noOfApps is invalid");
				return false;
			}
			if (goodCamera == true) {
				System.out.println("goodCamera is valid");
			} else {
				System.err.println("goodCamera is invalid");
				return false;

			}
			if (fingerLock == true) {
				System.out.println("fingerLock is valid");
			} else {
				System.err.println("fingerLock is invalid");
				return false;

			}
			this.mobileRepository.save(dto);
			return true;
		}
		return false;
	}

	@Override
	public MobileDTO findByBrand(String brand) {
		System.out.println("Invoking findByBrand " + brand);
		if (brand != null && !brand.isEmpty() && brand.length() > 3 && brand.length() < 20) {
			System.out.println("brand is valid");
			MobileDTO dto = this.mobileRepository.findByBrand(brand);
			return dto;
		} else {
			System.err.println("brand is invalid");
		}
		return MobileService.super.findByBrand(brand);
	}

}
