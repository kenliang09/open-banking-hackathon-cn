package com.hackathon.ob.futureinvestor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.ob.futureinvestor.domain.CheckPrice;
import com.hackathon.ob.futureinvestor.domain.CheckPriceRepository;

@RestController
public class CheckPriceController {
	
	@Autowired
	private CheckPriceRepository checkPriceRepository;

	@RequestMapping("/searchPriceByName")
    @Cacheable(value="name-key")
	public List<CheckPrice> searchPriceByName() {
		List<CheckPrice> prices = checkPriceRepository.searchPriceByName("lv");
		System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功"); 
		return prices;
	}
	
	@RequestMapping("/searchPriceByName")
    @Cacheable(value="ken-Prices")
	public CheckPrice searchPriceByProduced() {
		CheckPrice price = checkPriceRepository.searchPriceByProduced("lv", "USA");
		System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功"); 
		return price;
	}
}
