package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("dataSourceService")
public class ProdDataSourceService implements DataSourceService{
    @Override
    public String getDataSourceName() {
        return "prod";
    }
}
