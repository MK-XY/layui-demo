package layui.demo.layuidemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchUser extends User{
    private Integer minAge;
    private Integer maxAge;
}
