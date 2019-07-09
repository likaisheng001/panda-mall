package com.panda.product.core.test.base;

 
import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;
import org.junit.Test;

public class ZookeeperTest {
  @Test
  public void test01(){
    ZkClient zkClient = new ZkClient("101.200.37.71:2181,101.200.45.116:2181,47.88.159.1:2181");//建立连接  
        // zkClient.exists('/root'); //判断目录是否存在  
        zkClient.create("/root","mydata", CreateMode.PERSISTENT);//创建目录并写入数据  
        String data=zkClient.readData("/root");  
        System.out.println(data);  
        zkClient.delete("/root");//删除目录  
        // zkClient.deleteRecursive("/root");//递归删除节目录 
  }
}