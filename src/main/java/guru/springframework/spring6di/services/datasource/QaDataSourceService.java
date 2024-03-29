package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("dataSourceService")
public class QaDataSourceService implements DataSourceService {
    @Override
    public String getDataSourceName() {
        return "qa";
    }
}
