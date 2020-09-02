#!/bin/bash

#取当前目录
BASE_PATH=`cd "$(dirname "$0")"; pwd`

cd $BASE_PATH

# 打包命令
mvn clean package -Denv=dev

# 打压缩包
cd $BASE_PATH/eureka-server/target/eureka-server/
tar zcf $BASE_PATH/eureka-server/target/eureka-server.tar.gz *

cd $BASE_PATH

echo "服务接口包路径："
echo "$BASE_PATH/eureka-server/target/eureka-server.tar.gz"
echo "OK"