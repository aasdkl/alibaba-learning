package order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "service-product", path = "/product")
public interface ProductService {

    @RequestMapping("/get/{id}")
    public String get(@PathVariable("id") int id); // 不能省略 id
}
