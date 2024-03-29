package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("dataSourceService")
public class UatDataSourceService implements DataSourceService{
    @Override
    public String getDataSourceName() {
        return "uat";
    }
}
