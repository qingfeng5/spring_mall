package java.com.qingfeng.service.test;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.qingfeng.common.ServerResponse;
import com.qingfeng.service.IProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.com.qingfeng.test.TestBase;
import java.util.List;

/**
 * @author 清风
 * @date 2020/2/20 10:30
 */

public class ProductServiceTest extends TestBase {
    @Autowired
    private IProductService iProductService;

    @Test
    public void testIProductService(){
        ServerResponse<PageInfo> result =  iProductService.getProductByKeywordCategory("iphone",2,1,5,"price_desc");
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<String> images = Lists.newArrayList();
        images.add("mmall/aa.jpg");
        images.add("mmall/bb.jpg");
        images.add("mmall/cc.jpg");
        images.add("mmall/dd.jpg");
        images.add("mmall/ee.jpg");
//        ["mmall/aa.jpg","mmall/bb.jpg","mmall/cc.jpg","mmall/dd.jpg","mmall/ee.jpg"]
    }
}
