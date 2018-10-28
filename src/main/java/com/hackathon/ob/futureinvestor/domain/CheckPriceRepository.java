package com.hackathon.ob.futureinvestor.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckPriceRepository extends JpaRepository<User, Long> {

	List<CheckPrice> searchPriceByName(String name);
	
	CheckPrice searchPriceByProduced(String name, String produced);
}
