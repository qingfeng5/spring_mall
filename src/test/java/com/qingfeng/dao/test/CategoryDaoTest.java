package java.com.qingfeng.dao.test;

import com.qingfeng.dao.CategoryMapper;
import com.qingfeng.pojo.Category;
import com.qingfeng.service.Impl.CategoryServiceImpl;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.com.qingfeng.test.TestBase;

/**
 * @author 清风
 * @date 2020/2/20 10:29
 */
public class CategoryDaoTest  extends TestBase {
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private CategoryServiceImpl iCategoryService;

    @Ignore
    @Test
    public void getCategoryChild(){
        Category d  = categoryMapper.selectByPrimaryKey(1);
        System.out.println(d);
        Category d4  = categoryMapper.selectByPrimaryKey(4);
        System.out.println(d4);
    }
    @Test
    public void testChildService(){
        iCategoryService.selectCategoryAndChildrenById(2);
    }

}
