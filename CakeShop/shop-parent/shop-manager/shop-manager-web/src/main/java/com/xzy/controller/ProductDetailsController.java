package com.xzy.controller;

import com.xzy.pojo.ProductDetails;
import com.xzy.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品管理controller
 * 就按MVC模式的开发模式来，我们项目中包含的结构层分别是view，controller，service，dao。
 * view是前台页面，用户发送请求时从前端的页面开始的，前端get到这个请求后会把请求和顺带参数信息传送到后台，后台接受这个请求找到对应的接口
 * 去执行对应的controller里的对应的方法，然后执行，然后controller会调用service层的业务逻辑，service有会去访问dao层来连接数据库。
 * 这是我们后端程序员都熟悉的开发模式，然而不论是刚开始从事程序开发的程序员还是有一定开发经验的程序员，有时候其实都特别搞得清楚controller
 * 层和service层之间的关系，会把他们的功能搞模糊，或者说是你虽然明确的知道他们两个的各自分工，但是在实际打开发过程中，就是会把一些代码写杂了，
 * 该写在service里的代码段写到controller里去了。
 * 所以，我们为了规范，有必要搞清楚controller中到底是写什么东西来着，
 * 1、这里只接受数据，然后校验数据，校验合法性和准确性，比如说登录的controller，接收到用户名和密码，你要判断长度是否符合要求，密码解密出来。
 * 2、有的必要的情况，创建一个对象，把数据补全，比如他的一些简单的属性，创建时间啊修改时间啊，还有初始值什么的。
 * 3、其他的额都不要写在controller里，其他的复杂业务逻辑判断什么的，都放在service里头去。
 */
@Controller
public class ProductDetailsController {

    @Autowired
    private ProductDetailsService productDetailsService;

    @RequestMapping("/ProductDetails/{productId}")
    @ResponseBody
    public ProductDetails getProductDetailsById(@PathVariable Long productId) {
        ProductDetails pd = productDetailsService.getProductDetailsById(productId);
        return pd;
    }
}
