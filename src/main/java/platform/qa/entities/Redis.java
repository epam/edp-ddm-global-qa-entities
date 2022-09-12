package platform.qa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Redis {
    private String url;
    private String password;
    private String masterName;

    public Redis(String url, String password){
        this.masterName = "mymaster";
        this.url = url;
        this.password = password;
    }
}
