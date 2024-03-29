package guru.springframework.spring6di.services.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class ProdDataSourceServiceTest {

    @Autowired
    DataSourceService service;

    @Test
    void getDataSourceName() {
        System.out.println(service.getDataSourceName());
    }
}