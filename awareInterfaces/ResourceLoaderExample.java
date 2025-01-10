package awareInterfaces;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ResourceLoaderExample  implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
        System.out.println("#ResourceLoaderExample");
    }

    public void loadResource() {
        // Loading a resource (file) from the classpath
        Resource resource = resourceLoader.getResource("classpath:loader.txt");
        try {
            System.out.println("Resource content: " + new String(resource.getInputStream().readAllBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
