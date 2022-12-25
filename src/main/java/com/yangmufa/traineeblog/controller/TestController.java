package com.yangmufa.traineeblog.controller;

import com.yangmufa.traineeblog.entity.SaleGoods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping(value = "/get/httpmessageconverter", method = RequestMethod.GET)
    @ResponseBody //将对象转换为 json 格式并输出为响应信息
    public SaleGoods httpMessageConverterTest() {
        SaleGoods saleGoods = new SaleGoods();
        saleGoods.setGoodsName("华为手机");
        saleGoods.setId(1);
        saleGoods.setOnSale(true);
        saleGoods.setType(1);
        saleGoods.setWeight(300);
        return saleGoods;
    }

    @RequestMapping(value = "/test/httpmessageconverter", method = RequestMethod.POST)
    @ResponseBody
    // @RequestBody 接收前端请求并将参数转换为后端定义的 SaleGoods 对象
    public SaleGoods httpMessageConverterTest2(@RequestBody SaleGoods saleGoods) {
        System.out.println(saleGoods.toString());
        saleGoods.setType(saleGoods.getType() + 1);
        saleGoods.setGoodsName("商品名：" + saleGoods.getGoodsName());
        System.out.println(saleGoods);
        return saleGoods;
    }
}
