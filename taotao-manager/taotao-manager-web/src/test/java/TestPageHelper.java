import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 分页插件测试
 *
 * @author mayue
 * @mail dashingmy@163.com
 * @TIME 2019/3/22   21:00
 */
public class TestPageHelper {

   /* @Test
    public void testPageHelper() {
        // 加载spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        // 从spring容器中获得mapper的代理对象
        TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
        // 执行查询并分页
        TbItemExample example = new TbItemExample();
        // 分页处理
        PageHelper.startPage(1, 10);
        List<TbItem> list = mapper.selectByExample(example);
        // 循环遍历出取得的商品信息
        for (TbItem tbItem : list) {
            System.out.println(tbItem.getTitle());
        }
        // 取得分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        Long total = pageInfo.getTotal();
        System.out.println("共有商品:"+total);
    }*/


}
