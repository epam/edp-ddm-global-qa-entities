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

import lombok.*;

/**
 * Representation of Git repository
 */
@Setter
@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Repository {

    private String url;
    private String tokenName;
    private String token;
    private String repoName;
    private String branch;
    private String tag;

    public Repository (Service service, String repoName, String branch) {
    this.url =  service.getUrl();
    this.tokenName = service.getLogin();
    this.token = service.getPassword();
    this.repoName = repoName;
    this.branch = branch;
    }

    public Repository (Service service) {
        this.url =  service.getUrl();
        this.tokenName = service.getLogin();
        this.token = service.getPassword();
    }

}
