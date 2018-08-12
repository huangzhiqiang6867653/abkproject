

#1、shrio配置说明
   [查看引用](https://www.cnblogs.com/grasp/p/9064133.html)

>1.1、解释说明

这里进行简单的备注

#2、缓存使用说明(ehcache)
   [查看引用](https://www.cnblogs.com/coprince/p/5984816.html)

>2.1、说明

      spring自带缓存、自建缓存管理器等都可解决项目部分性能问题。结合Ehcache后性能更优，使用也比较简单。
    在进行Ehcache学习之前，最好对Spring自带的缓存管理有一个总体的认识  [查看](https://www.ibm.com/developerworks/cn/opensource/os-cn-spring-cache/)

>2.2、ehcache-spring-annotations简介

     * @see ---------------------------------------------------------------------------------------------------------------- 
     * @see 关于Spring与Ehcache的集成,googlecode上有一个经Apache认证的开源项目叫做ehcache-spring-annotations 
     * @see 目前已经到了1.2.0版本,它只是简化了Spring和Ehcache集成的复杂性(事实上我觉得完全没必要,因为它俩集成并不复杂) 
     * @see 尽管如此还是要提一下,它的项目主页为https://code.google.com/p/ehcache-spring-annotations/ 
     * @see 这篇文章中描述了其用法http://blog.goyello.com/2010/07/29/quick-start-with-ehcache-annotations-for-spring/ 
     * @see ---------------------------------------------------------------------------------------------------------------- 
     * @see 1)使用时在项目中引入ehcache-spring-annotations-1.2.0.jar和guava-r09.jar两个jar文件 
     * @see 2)然后在applicationContext.xml按照如下配置 
     * @see   <beans xmlns:ehcache="http://ehcache-spring-annotations.googlecode.com/svn/schema/ehcache-spring" 
     * @see         xsi:schemaLocation="http://ehcache-spring-annotations.googlecode.com/svn/schema/ehcache-spring 
     * @see         http://ehcache-spring-annotations.googlecode.com/svn/schema/ehcache-spring/ehcache-spring-1.2.xsd"> 
     * @see   <ehcache:annotation-driven/> 
     * @see   <ehcache:config cache-manager="cacheManager"> 
     * @see       <ehcache:evict-expired-elements interval="60"/> 
     * @see   </ehcache:config> 
     * @see   <bean id="cacheManager" class="org.springframework.cache.ehcache.EhCacheManagerFactoryBean"> 
     * @see       <property name="configLocation" value="classpath:ehcache.xml"/> 
     * @see   </bean> 
     * @see 3)最后在需要缓存的方法上使用@Cacheable和@TriggersRemove注解即可 
     * @see   经我亲测,@TriggersRemove(cacheName="..", when="..", removeAll=true)可移除缓存中的全部对象 
     * @see   但若写成@TriggersRemove(cacheName="..", when="..")则不会移除缓存中的单一的或所有的对象,即缓存中的对象无变化 
     * @see ---------------------------------------------------------------------------------------------------------------- 
     
#3、sql脚本 