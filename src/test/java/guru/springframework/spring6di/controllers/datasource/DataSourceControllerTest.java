package guru.springframework.spring6di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DataSourceControllerTest {

    @Autowired
    DataSourceController controller;

    @Test
    void getDataSourceName() {
        System.out.println(controller.getDataSourceName());
    }
}