package java.com.qingfeng.service.test;

import com.github.pagehelper.PageInfo;
import com.qingfeng.common.ServerResponse;
import com.qingfeng.pojo.Shipping;
import com.qingfeng.service.Impl.ShippingServiceImpl;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.com.qingfeng.test.TestBase;
import java.util.List;

/**
 * @author 清风
 * @date 2020/2/20 10:31
 */
public class ShippingServiceTest extends TestBase {
    private Logger logger = LoggerFactory.getLogger(ShippingServiceTest.class);


    @Autowired
    private ShippingServiceImpl iShippingService;

    @Test
    public void testSelect(){
        ServerResponse sr = iShippingService.select(1, 3);
        Shipping shipping = (Shipping)sr.getData();
        logger.info(ToStringBuilder.reflectionToString(shipping));

    }

    @Test
    public void testList() {
        ServerResponse sr = iShippingService.list(1, 1, 2);
        PageInfo<Shipping> p = new PageInfo<Shipping>((List<Shipping>) sr.getData());
        logger.info(ToStringBuilder.reflectionToString(sr.getData()));
        logger.info("======");

        ServerResponse x = ServerResponse.createBySuccess(p);
        logger.info(ToStringBuilder.reflectionToString(x));

//        {
//            "status": 0,
//                "date": {
//            "pageNum": 1,
//                    "pageSize": 2,
//                    "size": 2,
//                    "startRow": 1,
//                    "endRow": 2,
//                    "total": 8,
//                    "pages": 4,
//                    "list": [
//            {
//                "id": 3,
//                    "userId": 1,
//                    "receiverName": "a",
//                    "receiverPhone": "0100",
//                    "receiverMobile": "186",
//                    "receiverProvince": "北京",
//                    "receiverCity": "北京",
//                    "receiverDistrict": "昌平区",
//                    "receiverAddress": "矩阵小区",
//                    "receiverZip": "100000",
//                    "createTime": 1480515824000,
//                    "updateTime": 1480515824000
//            },
//            {
//                "id": 4,
//                    "userId": 1,
//                    "receiverName": "b",
//                    "receiverPhone": "0100",
//                    "receiverMobile": "186",
//                    "receiverProvince": "北京",
//                    "receiverCity": "北京",
//                    "receiverDistrict": "昌平区",
//                    "receiverAddress": "矩阵小区",
//                    "receiverZip": "100000",
//                    "createTime": 1480515824000,
//                    "updateTime": 1480515824000
//            }
//            ],
//            "firstPage": 1,
//                    "prePage": 0,
//                    "nextPage": 2,
//                    "lastPage": 4,
//                    "isFirstPage": true,
//                    "isLastPage": false,
//                    "hasPreviousPage": false,
//                    "hasNextPage": true,
//                    "navigatePages": 8,
//                    "navigatepageNums": [
//            1,
//                    2,
//                    3,
//                    4
//            ]
//        }
//        }
    }
}
