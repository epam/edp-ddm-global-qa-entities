/*
 * Copyright 2022 EPAM Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package platform.qa.entities;

import java.util.concurrent.TimeUnit;

/**
 * Utility entity for flexible configuration of async operations
 */
public class WaitConfiguration {
    private int poolIntervalTimeout;
    private TimeUnit poolIntervalTimeUnit;
    private int waitTimeout;
    private TimeUnit waitTimeUnit;

    private WaitConfiguration() {

    }

    private WaitConfiguration(int poolIntervalTimeout,
                              TimeUnit poolIntervalTimeUnit,
                              int waitTimeout,
                              TimeUnit waitTimeUnit) {
        this.poolIntervalTimeout = poolIntervalTimeout;
        this.poolIntervalTimeUnit = poolIntervalTimeUnit;
        this.waitTimeout = waitTimeout;
        this.waitTimeUnit = waitTimeUnit;
    }

    public static Builder newBuilder() {
        return new WaitConfiguration().new Builder();
    }

    public int getPoolIntervalTimeout() {
        return poolIntervalTimeout;
    }

    public TimeUnit getPoolIntervalTimeUnit() {
        return poolIntervalTimeUnit;
    }

    public int getWaitTimeout() {
        return waitTimeout;
    }

    public TimeUnit getWaitTimeUnit() {
        return waitTimeUnit;
    }

    public class Builder {
        private int poolIntervalTimeout = 1;
        private TimeUnit poolIntervalTimeUnit = TimeUnit.SECONDS;
        private int waitTimeout = 5;
        private TimeUnit waitTimeUnit = TimeUnit.MINUTES;

        private Builder() {
        }

        public Builder setPoolIntervalTimeout(int poolIntervalTimeout) {
            this.poolIntervalTimeout = poolIntervalTimeout;
            return this;
        }

        public Builder setPoolIntervalTimeUnit(TimeUnit poolIntervalTimeUnit) {
            this.poolIntervalTimeUnit = poolIntervalTimeUnit;
            return this;
        }

        public Builder setWaitTimeout(int waitTimeout) {
            this.waitTimeout = waitTimeout;
            return this;
        }

        public Builder setWaitTimeUnit(TimeUnit waitTimeUnit) {
            this.waitTimeUnit = waitTimeUnit;
            return this;
        }

        public WaitConfiguration build() {
            return new WaitConfiguration(poolIntervalTimeout,
                    poolIntervalTimeUnit,
                    waitTimeout,
                    waitTimeUnit
            );
        }
    }
}
