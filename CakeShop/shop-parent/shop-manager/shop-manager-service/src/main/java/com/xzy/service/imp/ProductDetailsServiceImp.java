package com.xzy.service.imp;

import com.xzy.mapper.ProductDetailsMapper;
import com.xzy.pojo.ProductDetails;
import com.xzy.pojo.ProductDetailsExample;
import com.xzy.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品管理service
 */
@Service
public class ProductDetailsServiceImp implements ProductDetailsService {

    @Autowired
    private ProductDetailsMapper productMapper;

    @Override
    public ProductDetails getProductDetailsById(long id) {

        //ProductDetails pd =productMapper.selectByPrimaryKey(id);
        //添加查询条件
        ProductDetailsExample example = new ProductDetailsExample();
        ProductDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andProductIdEqualTo(id);
        List<ProductDetails> list = productMapper.selectByExample(example);
        if(list != null&&list.size()>0) {
            ProductDetails pd = list.get(0);
            return pd;
        }
        return null;
    }
}
