package guru.springframework.spring6di.controllers.datasource;

import guru.springframework.spring6di.services.datasource.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class DataSourceController {
    private final DataSourceService service;

    public DataSourceController(@Qualifier("dataSourceService") DataSourceService service) {
        this.service = service;
    }

    public String getDataSourceName() {
        return service.getDataSourceName();
    }
}
