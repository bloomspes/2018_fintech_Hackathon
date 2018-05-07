package com.poa.www.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateController {
	// /로 접속되는 것들을 처리한다.
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String index() 
	{
		return "First Our Project Page create by Post On Air";
	}
	// /api/data에 Post로 접속하는 URL을 처리한다.
	@RequestMapping(value = {"/api/data"}, method = RequestMethod.POST)
	public String data(@RequestParam("id") String id,@RequestParam("price") String price) // id와 price parametar를 받는다.
	{
		System.out.println("id : "+id+" / price : "+price);
		return "1"; // 1을 클라이언트에게 리턴한다.
	}
}
