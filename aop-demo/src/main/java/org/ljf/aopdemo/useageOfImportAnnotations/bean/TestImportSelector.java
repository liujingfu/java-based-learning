package org.ljf.aopdemo.useageOfImportAnnotations.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * description
 *
 * @author ljf 2019/10/10 14:27
 */
public class TestImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"org.ljf.aopdemo.useageOfImportAnnotations.bean.TestBean3"};
    }
}
