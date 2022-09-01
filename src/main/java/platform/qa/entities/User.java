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

import java.util.List;
import java.util.Map;

/**
 * Representation of Registry user
 */
@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String login;
    private String password;
    private String token;
    private String mail;
    private String realm;
    private String clientId;

    private Key key;
    private Subject subject;
    private List<String> groups;
    private List<String> realmRoles;
    private long tokenExpireTime;
    private boolean isInitiated;

    private Map<String, List<String>> attributes;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, String mail) {
        this.login = login;
        this.password = password;
        this.mail = mail;
    }

    public User(String login, String password, Key key) {
        this.login = login;
        this.password = password;
        this.key = key;
    }

    public User(String login, String password, Map<String, List<String>> attributes) {
        this.login = login;
        this.password = password;
        this.attributes = attributes;
    }


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
