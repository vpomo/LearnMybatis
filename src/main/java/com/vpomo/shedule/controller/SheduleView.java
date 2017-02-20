package com.vpomo.shedule.controller;

import com.vpomo.shedule.model.Cart;
import com.vpomo.shedule.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Zver on 16.02.2017.
 */

@Controller
public class SheduleView {

    @Resource
    private CartService cartService;

    @RequestMapping(value = "/get")
    public
    @ResponseBody
    Cart getCart() {

        System.out.println("Делаем запрос ...");
        Cart result = cartService.queryCartById("004ff4fcd08b4b158b161c249a8cef3a");

        return result;
    }

}
