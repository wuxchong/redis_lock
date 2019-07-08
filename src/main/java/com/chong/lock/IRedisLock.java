package com.chong.lock;

public interface IRedisLock {
        Boolean lock(int lockNameExpireSecond, String lockName, Boolean isWait) throws Exception;

        Boolean unLock(String lockName) throws Exception;
}
