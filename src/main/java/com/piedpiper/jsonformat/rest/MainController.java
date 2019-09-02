package com.piedpiper.jsonformat.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
	@GetMapping("/api/getFormattedValue")
	public ResponseEntity getFormattedValue(){
		String s="Dummy Test";
		Map<String,String> retMap= new HashMap<>();
		retMap.put("data",s);
		return ResponseEntity.ok().body(retMap);
		
	}
}
