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
 * Representation of registry service with {@link User} service user
 */
@Setter
@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    private String url;
    private User user;
    private String login;
    private String password;
    private String token;

    public Service(String url) {
        this.url = url;
    }

    public Service(String url, User user) {
        this.url = url;
        this.login = user.getLogin();
        this.password = user.getPassword();
        this.user = user;
    }

    @Deprecated
    public Service(String url, String token) {
        this.url = url;
        this.token = token;
    }

    @Deprecated
    public Service(String url, String login, String password) {
        this.url = url;
        this.login = login;
        this.password = password;
    }
}
