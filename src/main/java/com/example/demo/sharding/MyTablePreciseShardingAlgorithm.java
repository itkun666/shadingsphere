package com.example.demo.sharding;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public class MyTablePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> tableNames, PreciseShardingValue<Long> shardingValue) {
        for (String tableName : tableNames) {
            /**
             * 取模算法，分片健 % 表数量
             */
            String value = shardingValue.getValue() % tableNames.size() + "";
            if (tableName.endsWith(value)) {
                return tableName;
            }
        }
        throw new IllegalArgumentException();
    }
}
