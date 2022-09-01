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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/**
 * Representation of business process with tasks:
 * {@link BusinessProcess.UserTask}
 * {@link BusinessProcess.ServiceTask}
 * {@link BusinessProcess.BusinessRuleTask}
 */
public class BusinessProcess {

    public List<UserTask> userTask;
    public List<ServiceTask> serviceTask;
    public List<BusinessRuleTask> businessRuleTask;
    public String id;
    public String name;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class UserTask {
        public String id;
        public String name;
        public String formKey;
        public String formTitle;
        public String assignee;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ServiceTask {
        public String id;
        public String name;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class BusinessRuleTask {
        public String id;
        public String name;
        public String decisionRef;
        public String decisionName;
    }

}
