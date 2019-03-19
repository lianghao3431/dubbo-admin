package com.ustcinfo.lh.dubbo.zookeeper;

import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * @ClassName ZookeeperUtils
 * @Description
 * @Date 2019/2/27 14:21
 * @Aurhor liang.hao
 * @email liang.hao@ustcinfo.com
 */
public class ZookeeperUtils {

    public static void main(String[] args) throws KeeperException, InterruptedException {
        try {
            ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181", 5000, new Watcher() {
                public void process(WatchedEvent watchedEvent) {
                    System.out.println("已经触发了" + watchedEvent.getType() + "事件！");
                    System.out.println("已经触发了" + watchedEvent.getPath() + "路径");
                }
            });
         /*   zooKeeper.create("/testPath","testRootData".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
                    CreateMode.PERSISTENT);*/
       /*     zooKeeper.create("/testPath/testChildPathOne", "testChildPathOne".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
                    CreateMode.PERSISTENT);
            zooKeeper.create("/testPath/testChildPathTwo", "testChildPathTwo".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
                    CreateMode.PERSISTENT);*/
            System.out.println(zooKeeper.getChildren("/testPath", true));


            zooKeeper.setData("/testPath/testChildPathOne", "modifyChildDataOne".getBytes(), -1);
            System.out.println("目录节点状态：[" + zooKeeper.exists("/testRootPath", true) + "]");
            // 创建另外一个子目录节点
       /*     zooKeeper.create("/testPath/testChildPathTwo", "testChildDataTwo".getBytes(),
                    ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);*/
            System.out.println(new String(zooKeeper.getData("/testPath/testChildPathTwo", true, null)));
            // 删除子目录节点
            zooKeeper.delete("/testPath/testChildPathTwo", -1);
            zooKeeper.delete("/testPath/testChildPathOne", -1);
            // 删除父目录节点
            zooKeeper.delete("/testPath", -1);
            // 关闭连接
            zooKeeper.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
