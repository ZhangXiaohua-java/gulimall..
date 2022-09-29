# Spring Cloud Alibaba

## Nacos

### 多配置集

``` yaml
spring:
    cloud: 
      nacos:
        config:
            # List<Config> extensionConfigs 此处对应着一个集合,又多个配置集可以写多个
            extension-configs:
              - data-id: product-datasource.yaml
                refresh: true
                group: JAVA_GROUP
                
```

###  配置隔离与服务隔离

```html
Nacos的数据模型分三层,namespace,group,data-id,不同的namespace,与group之前都是相互隔离的,
实现配置隔离的依赖Nacos可以实现基于环境的配置隔离,创建指定环境的namespace就可以实现隔离,
也可以基于服务的隔离,每一个服务都有单独的namespace,依靠group实现区分不同环境下的配置文件.

```

