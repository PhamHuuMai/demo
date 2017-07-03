package vn.com.ntq.ntqsocialnetwork.config.tiles;

import org.apache.tiles.extras.complete.CompleteAutoloadTilesInitializer;
import org.apache.tiles.factory.AbstractTilesContainerFactory;
import org.apache.tiles.request.ApplicationContext;

public class FreeMarkerTilesInitializer extends CompleteAutoloadTilesInitializer {

    @Override
    protected AbstractTilesContainerFactory createContainerFactory(ApplicationContext context) {
        return new FreeMarkerTilesContainerFactory();
    }

}
