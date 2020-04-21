
package com.example.demo;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.math.BigDecimal;

@RestController
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;


    private BigDecimal maxMoney;
    private BigDecimal minMoney;
    private String description;

    @RequestMapping("/add")
    public String add() {
        return "最小金额是" + limitConfig.getMinMoney()+ "最大金额是"+limitConfig.getMinMoney()+"红包描述"+limitConfig.getDescription();}

    @RequestMapping("/hello")
    public String sayHello() {
        return "恭喜发财，大吉大利";
    }
    @RequestMapping("/details")
    public String details() {
        return "这是商品详情页";
    }}

