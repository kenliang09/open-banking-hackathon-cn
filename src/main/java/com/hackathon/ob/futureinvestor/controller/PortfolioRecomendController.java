package com.hackathon.ob.futureinvestor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.ob.futureinvestor.domain.PortfolioRecomendRepository;

@RestController
public class PortfolioRecomendController {
	
	@Autowired
	private PortfolioRecomendRepository portfolioRecomendRepository;

}
