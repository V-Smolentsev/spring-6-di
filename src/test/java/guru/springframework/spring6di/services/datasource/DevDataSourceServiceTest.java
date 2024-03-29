package guru.springframework.spring6di.services.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class DevDataSourceServiceTest {

    @Autowired
    DataSourceService service;

    @Test
    void getDataSourceName() {
        System.out.println(service.getDataSourceName());
    }
}