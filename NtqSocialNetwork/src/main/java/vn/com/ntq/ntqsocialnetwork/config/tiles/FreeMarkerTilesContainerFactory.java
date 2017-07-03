package vn.com.ntq.ntqsocialnetwork.config.tiles;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.evaluator.AttributeEvaluatorFactory;
import org.apache.tiles.extras.complete.CompleteAutoloadTilesContainerFactory;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.freemarker.render.FreemarkerRendererBuilder;
import org.apache.tiles.request.render.BasicRendererFactory;

public class FreeMarkerTilesContainerFactory extends CompleteAutoloadTilesContainerFactory {

    @Override
    protected void registerAttributeRenderers(BasicRendererFactory rendererFactory,
            ApplicationContext applicationContext, TilesContainer container,
            AttributeEvaluatorFactory attributeEvaluatorFactory) {
        super.registerAttributeRenderers(rendererFactory, applicationContext, container, attributeEvaluatorFactory);
        FreemarkerRendererBuilder freemarkerRenderer = FreemarkerRendererBuilder.createInstance();
        freemarkerRenderer.setApplicationContext(applicationContext);
        freemarkerRenderer.setParameter("TemplatePath", "/");
        freemarkerRenderer.setParameter("NoCache", "true");
        freemarkerRenderer.setParameter("ContentType", "text/html;Charset=UTF-8");
        freemarkerRenderer.setParameter("default_encoding", "utf8");
        freemarkerRenderer.setParameter("template_update_delay", "0");
        freemarkerRenderer.setParameter("number_format", "0.##########");
        rendererFactory.registerRenderer("freemarker", freemarkerRenderer.build());
    }

}
